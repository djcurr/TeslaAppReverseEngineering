package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import ch.qos.logback.core.sift.DefaultDiscriminator;
import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.spi.CyclicBufferTracker;
import ch.qos.logback.core.util.ContentTypeUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/* loaded from: classes.dex */
public abstract class SMTPAppenderBase<E> extends AppenderBase<E> {
    static InternetAddress[] EMPTY_IA_ARRAY = new InternetAddress[0];
    static final long MAX_DELAY_BETWEEN_STATUS_MESSAGES = 1228800000;
    protected CyclicBufferTracker<E> cbTracker;
    protected EventEvaluator<E> eventEvaluator;
    private String from;
    protected Layout<E> layout;
    String localhost;
    String password;
    protected Session session;
    private String smtpHost;
    protected Layout<E> subjectLayout;
    String username;
    long lastTrackerStatusPrint = 0;
    long delayBetweenStatusMessages = 300000;
    private List<PatternLayoutBase<E>> toPatternLayoutList = new ArrayList();
    private String subjectStr = null;
    private int smtpPort = 25;
    private boolean starttls = false;
    private boolean ssl = false;
    boolean asynchronousSending = true;
    private String charsetEncoding = "UTF-8";
    protected Discriminator<E> discriminator = new DefaultDiscriminator();
    private int errorCount = 0;

    /* loaded from: classes.dex */
    class SenderRunnable implements Runnable {
        final CyclicBuffer<E> cyclicBuffer;

        /* renamed from: e  reason: collision with root package name */
        final E f9133e;

        SenderRunnable(CyclicBuffer<E> cyclicBuffer, E e11) {
            this.cyclicBuffer = cyclicBuffer;
            this.f9133e = e11;
        }

        @Override // java.lang.Runnable
        public void run() {
            SMTPAppenderBase.this.sendBuffer(this.cyclicBuffer, this.f9133e);
        }
    }

    private Session buildSessionFromProperties() {
        Properties properties = new Properties(OptionHelper.getSystemProperties());
        String str = this.smtpHost;
        if (str != null) {
            properties.put("mail.smtp.host", str);
        }
        properties.put("mail.smtp.port", Integer.toString(this.smtpPort));
        String str2 = this.localhost;
        if (str2 != null) {
            properties.put("mail.smtp.localhost", str2);
        }
        LoginAuthenticator loginAuthenticator = null;
        if (this.username != null) {
            loginAuthenticator = new LoginAuthenticator(this.username, this.password);
            properties.put("mail.smtp.auth", "true");
        }
        if (isSTARTTLS() && isSSL()) {
            addError("Both SSL and StartTLS cannot be enabled simultaneously");
        } else {
            if (isSTARTTLS()) {
                properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.transport.protocol", "true");
            }
            if (isSSL()) {
                properties.put("mail.smtp.ssl.enable", "true");
            }
        }
        return Session.getInstance(properties, loginAuthenticator);
    }

    private List<InternetAddress> parseAddress(E e11) {
        int size = this.toPatternLayoutList.size();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                String doLayout = this.toPatternLayoutList.get(i11).doLayout(e11);
                if (doLayout != null && doLayout.length() != 0) {
                    arrayList.addAll(Arrays.asList(InternetAddress.parse(doLayout, true)));
                }
            } catch (AddressException e12) {
                addError("Could not parse email address for [" + this.toPatternLayoutList.get(i11) + "] for event [" + e11 + "]", e12);
            }
        }
        return arrayList;
    }

    public void addTo(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Null or empty <to> property");
        }
        PatternLayoutBase<E> makeNewToPatternLayout = makeNewToPatternLayout(str.trim());
        makeNewToPatternLayout.setContext(this.context);
        makeNewToPatternLayout.start();
        this.toPatternLayoutList.add(makeNewToPatternLayout);
    }

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e11) {
        if (checkEntryConditions()) {
            String discriminatingValue = this.discriminator.getDiscriminatingValue(e11);
            long currentTimeMillis = System.currentTimeMillis();
            CyclicBuffer<E> orCreate = this.cbTracker.getOrCreate(discriminatingValue, currentTimeMillis);
            subAppend(orCreate, e11);
            try {
                if (this.eventEvaluator.evaluate(e11)) {
                    CyclicBuffer<E> cyclicBuffer = new CyclicBuffer<>(orCreate);
                    orCreate.clear();
                    if (this.asynchronousSending) {
                        this.context.getScheduledExecutorService().execute(new SenderRunnable(cyclicBuffer, e11));
                    } else {
                        sendBuffer(cyclicBuffer, e11);
                    }
                }
            } catch (EvaluationException e12) {
                int i11 = this.errorCount + 1;
                this.errorCount = i11;
                if (i11 < 4) {
                    addError("SMTPAppender's EventEvaluator threw an Exception-", e12);
                }
            }
            if (eventMarksEndOfLife(e11)) {
                this.cbTracker.endOfLife(discriminatingValue);
            }
            this.cbTracker.removeStaleComponents(currentTimeMillis);
            if (this.lastTrackerStatusPrint + this.delayBetweenStatusMessages < currentTimeMillis) {
                addInfo("SMTPAppender [" + this.name + "] is tracking [" + this.cbTracker.getComponentCount() + "] buffers");
                this.lastTrackerStatusPrint = currentTimeMillis;
                long j11 = this.delayBetweenStatusMessages;
                if (j11 < MAX_DELAY_BETWEEN_STATUS_MESSAGES) {
                    this.delayBetweenStatusMessages = j11 * 4;
                }
            }
        }
    }

    public boolean checkEntryConditions() {
        StringBuilder sb2;
        String str;
        if (!this.started) {
            sb2 = new StringBuilder();
            sb2.append("Attempting to append to a non-started appender: ");
            str = getName();
        } else if (this.eventEvaluator == null) {
            sb2 = new StringBuilder();
            sb2.append("No EventEvaluator is set for appender [");
            sb2.append(this.name);
            str = "].";
        } else if (this.layout != null) {
            return true;
        } else {
            sb2 = new StringBuilder();
            sb2.append("No layout set for appender named [");
            sb2.append(this.name);
            str = "]. For more information, please visit http://logback.qos.ch/codes.html#smtp_no_layout";
        }
        sb2.append(str);
        addError(sb2.toString());
        return false;
    }

    protected abstract boolean eventMarksEndOfLife(E e11);

    protected abstract void fillBuffer(CyclicBuffer<E> cyclicBuffer, StringBuffer stringBuffer);

    InternetAddress getAddress(String str) {
        try {
            return new InternetAddress(str);
        } catch (AddressException e11) {
            addError("Could not parse address [" + str + "].", e11);
            return null;
        }
    }

    public String getCharsetEncoding() {
        return this.charsetEncoding;
    }

    public CyclicBufferTracker<E> getCyclicBufferTracker() {
        return this.cbTracker;
    }

    public Discriminator<E> getDiscriminator() {
        return this.discriminator;
    }

    public String getFrom() {
        return this.from;
    }

    public Layout<E> getLayout() {
        return this.layout;
    }

    public String getLocalhost() {
        return this.localhost;
    }

    public String getPassword() {
        return this.password;
    }

    public String getSMTPHost() {
        return getSmtpHost();
    }

    public int getSMTPPort() {
        return getSmtpPort();
    }

    public String getSmtpHost() {
        return this.smtpHost;
    }

    public int getSmtpPort() {
        return this.smtpPort;
    }

    public String getSubject() {
        return this.subjectStr;
    }

    public List<String> getToAsListOfString() {
        ArrayList arrayList = new ArrayList();
        for (PatternLayoutBase<E> patternLayoutBase : this.toPatternLayoutList) {
            arrayList.add(patternLayoutBase.getPattern());
        }
        return arrayList;
    }

    public List<PatternLayoutBase<E>> getToList() {
        return this.toPatternLayoutList;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean isAsynchronousSending() {
        return this.asynchronousSending;
    }

    public boolean isSSL() {
        return this.ssl;
    }

    public boolean isSTARTTLS() {
        return this.starttls;
    }

    protected abstract PatternLayoutBase<E> makeNewToPatternLayout(String str);

    protected abstract Layout<E> makeSubjectLayout(String str);

    protected void sendBuffer(CyclicBuffer<E> cyclicBuffer, E e11) {
        try {
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            StringBuffer stringBuffer = new StringBuffer();
            String fileHeader = this.layout.getFileHeader();
            if (fileHeader != null) {
                stringBuffer.append(fileHeader);
            }
            String presentationHeader = this.layout.getPresentationHeader();
            if (presentationHeader != null) {
                stringBuffer.append(presentationHeader);
            }
            fillBuffer(cyclicBuffer, stringBuffer);
            String presentationFooter = this.layout.getPresentationFooter();
            if (presentationFooter != null) {
                stringBuffer.append(presentationFooter);
            }
            String fileFooter = this.layout.getFileFooter();
            if (fileFooter != null) {
                stringBuffer.append(fileFooter);
            }
            String str = "Undefined subject";
            Layout<E> layout = this.subjectLayout;
            if (layout != null) {
                str = layout.doLayout(e11);
                int indexOf = str != null ? str.indexOf(10) : -1;
                if (indexOf > -1) {
                    str = str.substring(0, indexOf);
                }
            }
            MimeMessage mimeMessage = new MimeMessage(this.session);
            String str2 = this.from;
            if (str2 != null) {
                mimeMessage.setFrom(getAddress(str2));
            } else {
                mimeMessage.setFrom();
            }
            mimeMessage.setSubject(str, this.charsetEncoding);
            List<InternetAddress> parseAddress = parseAddress(e11);
            if (parseAddress.isEmpty()) {
                addInfo("Empty destination address. Aborting email transmission");
                return;
            }
            InternetAddress[] internetAddressArr = (InternetAddress[]) parseAddress.toArray(EMPTY_IA_ARRAY);
            mimeMessage.setRecipients(Message.RecipientType.TO, internetAddressArr);
            String contentType = this.layout.getContentType();
            if (ContentTypeUtil.isTextual(contentType)) {
                mimeBodyPart.setText(stringBuffer.toString(), this.charsetEncoding, ContentTypeUtil.getSubType(contentType));
            } else {
                mimeBodyPart.setContent(stringBuffer.toString(), this.layout.getContentType());
            }
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(mimeBodyPart);
            mimeMessage.setContent(mimeMultipart);
            updateMimeMsg(mimeMessage, cyclicBuffer, e11);
            mimeMessage.setSentDate(new Date());
            addInfo("About to send out SMTP message \"" + str + "\" to " + Arrays.toString(internetAddressArr));
            Transport.send(mimeMessage);
        } catch (Exception e12) {
            addError("Error occurred while sending e-mail notification.", e12);
        }
    }

    public void setAsynchronousSending(boolean z11) {
        this.asynchronousSending = z11;
    }

    public void setCharsetEncoding(String str) {
        this.charsetEncoding = str;
    }

    public void setCyclicBufferTracker(CyclicBufferTracker<E> cyclicBufferTracker) {
        this.cbTracker = cyclicBufferTracker;
    }

    public void setDiscriminator(Discriminator<E> discriminator) {
        this.discriminator = discriminator;
    }

    public void setEvaluator(EventEvaluator<E> eventEvaluator) {
        this.eventEvaluator = eventEvaluator;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setLayout(Layout<E> layout) {
        this.layout = layout;
    }

    public void setLocalhost(String str) {
        this.localhost = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setSMTPHost(String str) {
        setSmtpHost(str);
    }

    public void setSMTPPort(int i11) {
        setSmtpPort(i11);
    }

    public void setSSL(boolean z11) {
        this.ssl = z11;
    }

    public void setSTARTTLS(boolean z11) {
        this.starttls = z11;
    }

    public void setSmtpHost(String str) {
        this.smtpHost = str;
    }

    public void setSmtpPort(int i11) {
        this.smtpPort = i11;
    }

    public void setSubject(String str) {
        this.subjectStr = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.cbTracker == null) {
            this.cbTracker = new CyclicBufferTracker<>();
        }
        Session buildSessionFromProperties = buildSessionFromProperties();
        this.session = buildSessionFromProperties;
        if (buildSessionFromProperties == null) {
            addError("Failed to obtain javax.mail.Session. Cannot start.");
            return;
        }
        this.subjectLayout = makeSubjectLayout(this.subjectStr);
        this.started = true;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public synchronized void stop() {
        this.started = false;
    }

    protected abstract void subAppend(CyclicBuffer<E> cyclicBuffer, E e11);

    protected void updateMimeMsg(MimeMessage mimeMessage, CyclicBuffer<E> cyclicBuffer, E e11) {
    }
}