package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.ReconfigureOnChangeTask;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.Duration;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StatusListenerConfigHelper;
import com.adyen.checkout.components.model.payments.request.Address;
import java.net.URL;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class ConfigurationAction extends Action {
    static final String DEBUG_SYSTEM_PROPERTY_KEY = "logback.debug";
    static final String INTERNAL_DEBUG_ATTR = "debug";
    static final String PACKAGING_DATA_ATTR = "packagingData";
    static final String SCAN_ATTR = "scan";
    static final String SCAN_PERIOD_ATTR = "scanPeriod";
    static final Duration SCAN_PERIOD_DEFAULT = Duration.buildByMinutes(1.0d);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [ch.qos.logback.core.util.Duration] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ch.qos.logback.core.util.Duration] */
    private Duration getDurationOfScanPeriodAttribute(String str, Duration duration) {
        Throwable th2;
        Throwable th3 = null;
        if (!OptionHelper.isEmpty(str)) {
            try {
                th2 = Duration.valueOf(str);
            } catch (IllegalArgumentException | IllegalStateException e11) {
                th3 = e11;
                th2 = null;
            }
            if (th3 != null) {
                addWarn("Failed to parse 'scanPeriod' attribute [" + str + "]", th3);
            }
            th3 = th2;
        }
        if (th3 == null) {
            addInfo("No 'scanPeriod' specified. Defaulting to " + duration.toString());
            return duration;
        }
        return th3;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String systemProperty = OptionHelper.getSystemProperty(DEBUG_SYSTEM_PROPERTY_KEY);
        if (systemProperty == null) {
            systemProperty = interpretationContext.subst(attributes.getValue("debug"));
        }
        if (OptionHelper.isEmpty(systemProperty) || systemProperty.equalsIgnoreCase("false") || systemProperty.equalsIgnoreCase(Address.ADDRESS_NULL_PLACEHOLDER)) {
            addInfo("debug attribute not set");
        } else {
            StatusListenerConfigHelper.addOnConsoleListenerInstance(this.context, new OnConsoleStatusListener());
        }
        processScanAttrib(interpretationContext, attributes);
        new ContextUtil(this.context).addHostNameAsProperty();
        interpretationContext.pushObject(getContext());
        ((LoggerContext) this.context).setPackagingDataEnabled(OptionHelper.toBoolean(interpretationContext.subst(attributes.getValue(PACKAGING_DATA_ATTR)), false));
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        addInfo("End of configuration.");
        interpretationContext.popObject();
    }

    String getSystemProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    void processScanAttrib(InterpretationContext interpretationContext, Attributes attributes) {
        String subst = interpretationContext.subst(attributes.getValue(SCAN_ATTR));
        if (OptionHelper.isEmpty(subst) || "false".equalsIgnoreCase(subst)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.context.getScheduledExecutorService();
        URL mainWatchURL = ConfigurationWatchListUtil.getMainWatchURL(this.context);
        if (mainWatchURL == null) {
            addWarn("Due to missing top level configuration file, reconfiguration on change (configuration file scanning) cannot be done.");
            return;
        }
        ReconfigureOnChangeTask reconfigureOnChangeTask = new ReconfigureOnChangeTask();
        reconfigureOnChangeTask.setContext(this.context);
        this.context.putObject(CoreConstants.RECONFIGURE_ON_CHANGE_TASK, reconfigureOnChangeTask);
        Duration durationOfScanPeriodAttribute = getDurationOfScanPeriodAttribute(interpretationContext.subst(attributes.getValue(SCAN_PERIOD_ATTR)), SCAN_PERIOD_DEFAULT);
        addInfo("Will scan for changes in [" + mainWatchURL + "] ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting ReconfigureOnChangeTask scanning period to ");
        sb2.append(durationOfScanPeriodAttribute);
        addInfo(sb2.toString());
        this.context.addScheduledFuture(scheduledExecutorService.scheduleAtFixedRate(reconfigureOnChangeTask, durationOfScanPeriodAttribute.getMilliseconds(), durationOfScanPeriodAttribute.getMilliseconds(), TimeUnit.MILLISECONDS));
    }
}