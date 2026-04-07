import io.javalin.Javalin;
import com.google.gson.Gson;

import java.time.Instant;
import java.util.*;

public class App {

    static List<Usuario> usuarios = new ArrayList<>();
    static Gson gson = new Gson();

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7000);

        app.get("/hello", ctx -> ctx.result("Hello, Javalin!"));

        app.get("/status", ctx -> {
            Map<String, String> resp = new HashMap<>();
            resp.put("status", "ok");
            resp.put("timestamp", Instant.now().toString());
            ctx.json(resp);
        });

        app.post("/echo", ctx -> {
            Map body = gson.fromJson(ctx.body(), Map.class);
            ctx.json(body);
        });

        app.get("/saudacao/{nome}", ctx -> {
            String nome = ctx.pathParam("nome");
            ctx.json(Map.of("mensagem", "Olá, " + nome + "!"));
        });

        app.post("/usuarios", ctx -> {
            Usuario u = gson.fromJson(ctx.body(), Usuario.class);
            usuarios.add(u);
            ctx.status(201);
        });

        app.get("/usuarios", ctx -> ctx.json(usuarios));

        app.get("/usuarios/{email}", ctx -> {
            String email = ctx.pathParam("email");

            for (Usuario u : usuarios) {
                if (u.email.equals(email)) {
                    ctx.json(u);
                    return;
                }
            }

            ctx.status(404);
        });
    }
}
