package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.Colaborador;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
import java.util.List;

public class ColaboradorController extends Controller {

    public Result inserir() {

        Colaborador colaborador = Json.fromJson(request().body().asJson(), Colaborador.class);

//        Colaborador colaboradorBuscaCpf = Ebean.find(Colaborador.class).where().eq("cpf", colaborador.getCpf()).findUnique();
//
//        if (colaboradorBuscaCpf != null) {
//            return badRequest("O Colaborador já esta cadastrado");
//        }

        try {
            Logger.info(colaborador.toString());
            Ebean.save(colaborador);
        } catch (Exception e) {
            Logger.error(e.getMessage());
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(colaborador));
    }

    public Result atualizar(Long id) {

        Colaborador colaborador = Json.fromJson(request().body().asJson(), Colaborador.class);

        Colaborador colaboradorBusca = Ebean.find(Colaborador.class, id);

        if (colaboradorBusca == null) {
            return notFound("O Colaborador não foi encontrado");
        }

        try {
            Logger.info(colaborador.toString());
            Ebean.update(colaborador);
        } catch (Exception e) {
            Logger.error(e.getMessage());
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(colaborador));
    }

    public Result buscaPorId(Long id) {

        try {
            Colaborador colaborador = Ebean.find(Colaborador.class, id);

            if (colaborador == null) {
                return notFound("Colaborador não Encontrado");
            }

            return ok(Json.toJson(colaborador));
        } catch (Exception e) {
            Logger.error(e.getMessage());
            return badRequest("Erro interno de sistema");
        }

    }

    public Result buscaTodos() {

        try {
            return ok(Json.toJson(Ebean.find(Colaborador.class)
                    .order()
                    .asc("nome")
                    .findList()));
        } catch (Exception e) {
            Logger.error(e.getMessage());
            return badRequest("Erro interno de sistema");
        }

    }

    public Result remover(Long id) {

        Colaborador colaborador = Ebean.find(Colaborador.class, id);

        if (colaborador == null) {
            return notFound("Cliente não encontrado");
        }

        try {
            Ebean.delete(colaborador);
            return ok(Json.toJson(colaborador));
        } catch (PersistenceException e) {
            Logger.error(e.getMessage());
            return badRequest("Existem registros que dependem deste Colaborador");
        } catch (Exception e) {
            Logger.error(e.getMessage());
            return badRequest("Erro interno de sistema");
        }
    }

    public Result filtra(String filtro) {

        try {
            Query<Colaborador> query = Ebean.createQuery(Colaborador.class, "find colaborador where (nome like :nome or cargo like :cargo)");
            query.setParameter("nome", "%" + filtro + "%");
            query.setParameter("cargo", "%" + filtro + "%");
            List<Colaborador> filtroDeColaboradores = query.findList();
            return ok(Json.toJson(filtroDeColaboradores));
        } catch (Exception e) {
            Logger.error(e.getMessage());
            return badRequest("Erro interno de sistema");
        }
    }
}
