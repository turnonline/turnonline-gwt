package org.ctoolkit.turnonline.gwt.client.ui.feedback;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author <a href="mailto:jozef.pohorelec@ctoolkit.org">Jozef Pohorelec</a>
 */
public interface FeedbackEventHandler
        extends EventHandler
{
    void onMessage( FeedbackEvent event );
}
