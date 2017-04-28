/*
 * Comvai GWT, Comvai specific GWT components
 * Copyright (C) 2012 Comvai, s.r.o. All Rights Reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.ctoolkit.turnonline.gwt.client.command;

/**
 * This is general command exception, which is thrown in {@link org.ctoolkit.turnonline.gwt.server.CommandRemoteServiceServlet} methods
 * when some exception occur.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
public class CommandException
        extends Exception
{
    private Throwable rootException;

    public CommandException()
    {
    }

    public CommandException( String message )
    {
        super( message );
    }

    public CommandException( String message, Throwable cause )
    {
        super( message, cause );
    }

    public CommandException( Throwable cause )
    {
        super( cause );
        this.rootException = cause;
    }

    public Throwable getRootException()
    {
        return rootException;
    }
}
