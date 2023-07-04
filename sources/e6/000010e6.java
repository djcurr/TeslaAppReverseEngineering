package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/* loaded from: classes.dex */
public class IncludeAction extends AbstractIncludeAction {
    private static final String CONFIG_TAG = "configuration";
    private static final String INCLUDED_TAG = "included";
    private int eventOffset = 2;

    private String getEventName(SaxEvent saxEvent) {
        return saxEvent.qName.length() > 0 ? saxEvent.qName : saxEvent.localName;
    }

    private InputStream openURL(URL url) {
        try {
            return FirebasePerfUrlConnection.openStream(url);
        } catch (IOException e11) {
            optionalWarning("Failed to open [" + url.toString() + "]", e11);
            return null;
        }
    }

    private void trimHeadAndTail(SaxEventRecorder saxEventRecorder) {
        boolean z11;
        boolean z12;
        int i11;
        SaxEvent saxEvent;
        List<SaxEvent> saxEventList = saxEventRecorder.getSaxEventList();
        if (saxEventList.size() == 0) {
            return;
        }
        SaxEvent saxEvent2 = saxEventList.get(0);
        if (saxEvent2 != null) {
            String eventName = getEventName(saxEvent2);
            z12 = INCLUDED_TAG.equalsIgnoreCase(eventName);
            z11 = CONFIG_TAG.equalsIgnoreCase(eventName);
        } else {
            z11 = false;
            z12 = false;
        }
        if (z12 || z11) {
            saxEventList.remove(0);
            int size = saxEventList.size();
            if (size == 0 || (saxEvent = saxEventList.get(size - 1)) == null) {
                return;
            }
            String eventName2 = getEventName(saxEvent);
            if ((z12 && INCLUDED_TAG.equalsIgnoreCase(eventName2)) || (z11 && CONFIG_TAG.equalsIgnoreCase(eventName2))) {
                saxEventList.remove(i11);
            }
        }
    }

    protected SaxEventRecorder createRecorder(InputStream inputStream, URL url) {
        return new SaxEventRecorder(getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void processInclude(InterpretationContext interpretationContext, URL url) {
        InputStream openURL = openURL(url);
        try {
            if (openURL != null) {
                try {
                    ConfigurationWatchListUtil.addToWatchList(getContext(), url);
                    SaxEventRecorder createRecorder = createRecorder(openURL, url);
                    createRecorder.setContext(getContext());
                    createRecorder.recordEvents(openURL);
                    trimHeadAndTail(createRecorder);
                    interpretationContext.getJoranInterpreter().getEventPlayer().addEventsDynamically(createRecorder.getSaxEventList(), this.eventOffset);
                } catch (JoranException e11) {
                    optionalWarning("Failed processing [" + url.toString() + "]", e11);
                }
            }
        } finally {
            close(openURL);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setEventOffset(int i11) {
        this.eventOffset = i11;
    }
}