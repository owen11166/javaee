package tw.brad.tutor;

import java.util.HashMap;
import java.util.HashSet;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/myserver")
public class MyServer {
	private static HashSet<Session> sessions;
	private static HashMap<String, Session> users;
	private static HashMap<String, String> userNames;

	public MyServer() {
		System.out.println("myserver()");
		if (sessions == null) {
			sessions = new HashSet<>();
			users = new HashMap<>();
			userNames = new HashMap<>();
		}
	}

	@OnOpen
	public void OnOpen(Session session) {
		System.out.println("onOpen()" + session.getId());
		session.setMaxIdleTimeout(10 * 60 * 1000);
		if (sessions.add(session)) {
			users.put(session.getId(), session);
		}
		System.out.println("count" + sessions.size());
	}

	@OnMessage
	public void onMessage(String message, Session session) {

	}

	@OnClose
	public void onClose(Session session) {
		System.out.println("onClose():"+session.getId());
		users.remove(session.getId());
		sessions.remove(session);
		System.out.println("count"+sessions.size());
	}

	@OnError
	public void onError(Session session, Throwable t) {
		System.out.println("onError():"+session.getId());
		users.remove(session.getId());
		sessions.remove(session);
		System.out.println("count"+sessions.size());
	}
}
