package ch.qos.logback.core.joran;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.Interpreter;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.joran.spi.SimpleRuleStore;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.util.CloseUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.xml.sax.InputSource;

/* loaded from: classes.dex */
public abstract class GenericConfigurator extends ContextAwareBase {
    protected Interpreter interpreter;

    private final void doConfigure(InputSource inputSource) {
        long currentTimeMillis = System.currentTimeMillis();
        SaxEventRecorder saxEventRecorder = new SaxEventRecorder(this.context);
        saxEventRecorder.recordEvents(inputSource);
        doConfigure(saxEventRecorder.getSaxEventList());
        if (new StatusUtil(this.context).noXMLParsingErrorsOccurred(currentTimeMillis)) {
            addInfo("Registering current configuration as safe fallback point");
            registerSafeConfiguration(saxEventRecorder.getSaxEventList());
        }
    }

    public static void informContextOfURLUsedForConfiguration(Context context, URL url) {
        ConfigurationWatchListUtil.setMainWatchURL(context, url);
    }

    protected void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
    }

    protected abstract void addImplicitRules(Interpreter interpreter);

    protected abstract void addInstanceRules(RuleStore ruleStore);

    /* JADX INFO: Access modifiers changed from: protected */
    public void buildInterpreter() {
        SimpleRuleStore simpleRuleStore = new SimpleRuleStore(this.context);
        addInstanceRules(simpleRuleStore);
        Interpreter interpreter = new Interpreter(this.context, simpleRuleStore, initialElementPath());
        this.interpreter = interpreter;
        InterpretationContext interpretationContext = interpreter.getInterpretationContext();
        interpretationContext.setContext(this.context);
        addImplicitRules(this.interpreter);
        addDefaultNestedComponentRegistryRules(interpretationContext.getDefaultNestedComponentRegistry());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004b: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:16:0x004b */
    public final void doConfigure(File file) {
        IOException e11;
        Closeable closeable;
        URL url;
        FileInputStream fileInputStream;
        Closeable closeable2 = null;
        try {
            try {
                url = file.toURI().toURL();
                informContextOfURLUsedForConfiguration(getContext(), url);
                fileInputStream = new FileInputStream(file);
            } catch (IOException e12) {
                e11 = e12;
            } catch (Throwable th2) {
                th = th2;
                CloseUtil.closeQuietly(closeable2);
                throw th;
            }
            try {
                doConfigure(fileInputStream, url.toExternalForm());
                CloseUtil.closeQuietly(fileInputStream);
            } catch (IOException e13) {
                e11 = e13;
                String str = "Could not open [" + file.getPath() + "].";
                addError(str, e11);
                throw new JoranException(str, e11);
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
            CloseUtil.closeQuietly(closeable2);
            throw th;
        }
    }

    public final void doConfigure(InputStream inputStream) {
        try {
            doConfigure(new InputSource(inputStream));
            try {
                inputStream.close();
            } catch (IOException e11) {
                addError("Could not close the stream", e11);
                throw new JoranException("Could not close the stream", e11);
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
                throw th2;
            } catch (IOException e12) {
                addError("Could not close the stream", e12);
                throw new JoranException("Could not close the stream", e12);
            }
        }
    }

    public final void doConfigure(InputStream inputStream, String str) {
        InputSource inputSource = new InputSource(inputStream);
        inputSource.setSystemId(str);
        doConfigure(inputSource);
    }

    public final void doConfigure(String str) {
        doConfigure(new File(str));
    }

    public final void doConfigure(URL url) {
        InputStream inputStream = null;
        try {
            try {
                informContextOfURLUsedForConfiguration(getContext(), url);
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                uRLConnection.setUseCaches(false);
                inputStream = uRLConnection.getInputStream();
                doConfigure(inputStream, url.toExternalForm());
            } catch (IOException e11) {
                String str = "Could not open URL [" + url + "].";
                addError(str, e11);
                throw new JoranException(str, e11);
            }
        } finally {
            CloseUtil.closeQuietly(inputStream);
        }
    }

    public void doConfigure(List<SaxEvent> list) {
        buildInterpreter();
        synchronized (this.context.getConfigurationLock()) {
            this.interpreter.getEventPlayer().play(list);
        }
    }

    protected ElementPath initialElementPath() {
        return new ElementPath();
    }

    public List<SaxEvent> recallSafeConfiguration() {
        return (List) this.context.getObject(CoreConstants.SAFE_JORAN_CONFIGURATION);
    }

    public void registerSafeConfiguration(List<SaxEvent> list) {
        this.context.putObject(CoreConstants.SAFE_JORAN_CONFIGURATION, list);
    }
}