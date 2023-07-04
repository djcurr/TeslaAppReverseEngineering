package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public abstract class FormattingConverter<E> extends Converter<E> {
    static final int INITIAL_BUF_SIZE = 256;
    static final int MAX_CAPACITY = 1024;
    FormatInfo formattingInfo;

    public final FormatInfo getFormattingInfo() {
        return this.formattingInfo;
    }

    public final void setFormattingInfo(FormatInfo formatInfo) {
        if (this.formattingInfo != null) {
            throw new IllegalStateException("FormattingInfo has been already set");
        }
        this.formattingInfo = formatInfo;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public final void write(StringBuilder sb2, E e11) {
        String convert = convert(e11);
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo == null) {
            sb2.append(convert);
            return;
        }
        int min = formatInfo.getMin();
        int max = this.formattingInfo.getMax();
        if (convert == null) {
            if (min > 0) {
                SpacePadder.spacePad(sb2, min);
                return;
            }
            return;
        }
        int length = convert.length();
        if (length > max) {
            convert = this.formattingInfo.isLeftTruncate() ? convert.substring(length - max) : convert.substring(0, max);
        } else if (length < min) {
            if (this.formattingInfo.isLeftPad()) {
                SpacePadder.leftPad(sb2, convert, min);
                return;
            } else {
                SpacePadder.rightPad(sb2, convert, min);
                return;
            }
        }
        sb2.append(convert);
    }
}