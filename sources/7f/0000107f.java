package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.sift.AbstractAppenderFactoryUsingJoran;
import ch.qos.logback.core.sift.SiftingJoranConfiguratorBase;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppenderFactoryUsingJoran extends AbstractAppenderFactoryUsingJoran<ILoggingEvent> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AppenderFactoryUsingJoran(List<SaxEvent> list, String str, Map<String, String> map) {
        super(list, str, map);
    }

    @Override // ch.qos.logback.core.sift.AbstractAppenderFactoryUsingJoran
    public SiftingJoranConfiguratorBase<ILoggingEvent> getSiftingJoranConfigurator(String str) {
        return new SiftingJoranConfigurator(this.key, str, this.parentPropertyMap);
    }
}