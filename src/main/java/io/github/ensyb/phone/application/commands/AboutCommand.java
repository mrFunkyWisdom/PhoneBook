package io.github.ensyb.phone.application.commands;

import io.github.ensyb.phone.application.controller.Request;
import io.github.ensyb.phone.application.controller.response.Forward;
import io.github.ensyb.phone.application.controller.response.Response;

public class AboutCommand implements Command {

	@Override
	public Response execute(Request request) {
		return new Forward("about.jsp");
	}

}
