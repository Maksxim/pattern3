package by.tms.project.Commands;

import javax.servlet.ServletException;
import java.io.IOException;

public class UnknownCommand extends FrontCommand{

    @Override
    public void process() throws ServletException, IOException {
        forward("unknown");
    }
}
