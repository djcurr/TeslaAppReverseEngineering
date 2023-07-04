package expo.modules.kotlin.views;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.types.AnyType;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004B1\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/views/ConcreteViewProp;", "Landroid/view/View;", "ViewType", "PropType", "Lexpo/modules/kotlin/views/AnyViewProp;", "Lcom/facebook/react/bridge/Dynamic;", "prop", "onView", "Lvz/b0;", "set", "Lexpo/modules/kotlin/types/AnyType;", "propType", "Lexpo/modules/kotlin/types/AnyType;", "", "name", "Lkotlin/Function2;", "setter", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lh00/p;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ConcreteViewProp<ViewType extends View, PropType> extends AnyViewProp {
    private final AnyType propType;
    private final p<ViewType, PropType, b0> setter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConcreteViewProp(String name, AnyType propType, p<? super ViewType, ? super PropType, b0> setter) {
        super(name);
        s.g(name, "name");
        s.g(propType, "propType");
        s.g(setter, "setter");
        this.propType = propType;
        this.setter = setter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // expo.modules.kotlin.views.AnyViewProp
    public void set(Dynamic prop, View onView) {
        s.g(prop, "prop");
        s.g(onView, "onView");
        this.setter.invoke(onView, this.propType.convert(prop));
    }
}