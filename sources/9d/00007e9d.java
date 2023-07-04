package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.v;
import wz.e0;
import wz.p;
import wz.s0;

/* loaded from: classes5.dex */
public enum n {
    CLASS(Action.CLASS_ATTRIBUTE, false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE(Action.FILE_ATTRIBUTE, false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY(Action.CLASS_ATTRIBUTE, false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final Set<n> ALL_TARGET_SET;
    private static final Set<n> DEFAULT_TARGET_SET;
    private static final Map<e, n> USE_SITE_MAPPING;
    private final String description;
    private final boolean isDefault;
    public static final a Companion = new a(null);
    private static final HashMap<String, n> map = new HashMap<>();

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Set<n> S0;
        Set<n> E0;
        Map<e, n> l11;
        n[] values = values();
        int length = values.length;
        int i11 = 0;
        while (i11 < length) {
            n nVar = values[i11];
            i11++;
            map.put(nVar.name(), nVar);
        }
        n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar2 : values2) {
            if (nVar2.isDefault()) {
                arrayList.add(nVar2);
            }
        }
        S0 = e0.S0(arrayList);
        DEFAULT_TARGET_SET = S0;
        E0 = p.E0(values());
        ALL_TARGET_SET = E0;
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar3 = VALUE_PARAMETER;
        e eVar2 = e.FIELD;
        n nVar4 = FIELD;
        l11 = s0.l(v.a(eVar, nVar3), v.a(eVar2, nVar4), v.a(e.PROPERTY, PROPERTY), v.a(e.FILE, FILE), v.a(e.PROPERTY_GETTER, PROPERTY_GETTER), v.a(e.PROPERTY_SETTER, PROPERTY_SETTER), v.a(e.RECEIVER, nVar3), v.a(e.SETTER_PARAMETER, nVar3), v.a(e.PROPERTY_DELEGATE_FIELD, nVar4));
        USE_SITE_MAPPING = l11;
    }

    n(String str, boolean z11) {
        this.description = str;
        this.isDefault = z11;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    /* synthetic */ n(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? true : z11);
    }
}