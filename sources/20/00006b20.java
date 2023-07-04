package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/records/RegexValidator;", "Lexpo/modules/kotlin/records/FieldValidator;", "", "value", "Lvz/b0;", "validate", "Lkotlin/text/i;", "regex", "Lkotlin/text/i;", "<init>", "(Lkotlin/text/i;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class RegexValidator implements FieldValidator<CharSequence> {
    private final i regex;

    public RegexValidator(i regex) {
        s.g(regex, "regex");
        this.regex = regex;
    }

    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(CharSequence value) {
        s.g(value, "value");
        if (this.regex.g(value)) {
            return;
        }
        i iVar = this.regex;
        throw new ValidationException("Provided string " + ((Object) value) + " didn't match regex " + iVar);
    }
}