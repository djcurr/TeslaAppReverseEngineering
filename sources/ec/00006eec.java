package freemarker.template;

import freemarker.core.Configurable;
import freemarker.core.ParseException;

/* loaded from: classes5.dex */
public class Template extends Configurable {

    /* loaded from: classes5.dex */
    public static class WrongEncodingException extends ParseException {

        /* renamed from: j */
        public String f27011j;

        /* renamed from: k */
        private final String f27012k;

        @Override // freemarker.core.ParseException, java.lang.Throwable
        public String getMessage() {
            String str;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Encoding specified inside the template (");
            stringBuffer.append(this.f27011j);
            stringBuffer.append(") doesn't match the encoding specified for the Template constructor");
            if (this.f27012k != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(" (");
                stringBuffer2.append(this.f27012k);
                stringBuffer2.append(").");
                str = stringBuffer2.toString();
            } else {
                str = ".";
            }
            stringBuffer.append(str);
            return stringBuffer.toString();
        }
    }
}