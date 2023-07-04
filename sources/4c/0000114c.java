package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public abstract class CompositeConverter<E> extends DynamicConverter<E> {
    Converter<E> childConverter;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e11) {
        StringBuilder sb2 = new StringBuilder();
        for (Converter<E> converter = this.childConverter; converter != null; converter = converter.next) {
            converter.write(sb2, e11);
        }
        return transform(e11, sb2.toString());
    }

    public Converter<E> getChildConverter() {
        return this.childConverter;
    }

    public void setChildConverter(Converter<E> converter) {
        this.childConverter = converter;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CompositeConverter<");
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo != null) {
            sb2.append(formatInfo);
        }
        if (this.childConverter != null) {
            sb2.append(", children: ");
            sb2.append(this.childConverter);
        }
        sb2.append(">");
        return sb2.toString();
    }

    protected abstract String transform(E e11, String str);
}