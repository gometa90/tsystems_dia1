package com.tsystems.dia1.work;

import java.io.IOException;

import com.tsystems.dia1.work.configuration.HibernateUtil;
import com.tsystems.dia1.work.services.ElementNotFoundException;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

public class Application {

    public static void main(final String args[]) throws IOException, RepositoryConnectionException {

	HibernateUtil.getSession();

	CommandSwitcher commandSwitcher = new CommandSwitcher();
	try {
	    commandSwitcher.executeCommand(args);
	} catch (RepositoryConnectionException e) {
	    e.printStackTrace();
	} catch (ElementNotFoundException e) {
	    System.out.println("No existe ningún elemento con ese identificador ");
	}
    }
}
