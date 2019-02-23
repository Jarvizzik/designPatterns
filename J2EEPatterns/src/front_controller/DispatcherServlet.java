package front_controller;

public class DispatcherServlet {
	void process(String url) {
		switch (url) {
			case "home":
				new HomeController().show();
				break;
			case "user":
				new UserController().show();
				break;
			default:
				new DefaultController().show();
		}
	}
}
