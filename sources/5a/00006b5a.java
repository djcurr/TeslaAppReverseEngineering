package expo.modules.lineargradient;

import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyTypeKt;
import expo.modules.kotlin.views.AnyViewProp;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewManagerDefinitionBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import n00.r;
import vz.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/lineargradient/LinearGradientModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "<init>", "()V", "expo-linear-gradient_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class LinearGradientModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
        moduleDefinitionBuilder.name("ExpoLinearGradient");
        if (moduleDefinitionBuilder.getViewManagerDefinition() == null) {
            ViewManagerDefinitionBuilder viewManagerDefinitionBuilder = new ViewManagerDefinitionBuilder();
            LinearGradientModule$definition$1$1$1 linearGradientModule$definition$1$1$1 = LinearGradientModule$definition$1$1$1.INSTANCE;
            viewManagerDefinitionBuilder.setViewType(LinearGradientView.class);
            viewManagerDefinitionBuilder.setViewFactory(linearGradientModule$definition$1$1$1);
            viewManagerDefinitionBuilder.getProps().put("colors", new ConcreteViewProp("colors", AnyTypeKt.toAnyType(m0.m(int[].class)), LinearGradientModule$definition$1$1$2.INSTANCE));
            viewManagerDefinitionBuilder.getProps().put("locations", new ConcreteViewProp("locations", AnyTypeKt.toAnyType(m0.g(float[].class)), LinearGradientModule$definition$1$1$3.INSTANCE));
            LinearGradientModule$definition$1$1$4 linearGradientModule$definition$1$1$4 = LinearGradientModule$definition$1$1$4.INSTANCE;
            Map<String, AnyViewProp> props = viewManagerDefinitionBuilder.getProps();
            r.a aVar = r.f40137c;
            Class cls = Float.TYPE;
            props.put("startPoint", new ConcreteViewProp("startPoint", AnyTypeKt.toAnyType(m0.h(p.class, aVar.d(m0.m(cls)), aVar.d(m0.m(cls)))), linearGradientModule$definition$1$1$4));
            viewManagerDefinitionBuilder.getProps().put("endPoint", new ConcreteViewProp("endPoint", AnyTypeKt.toAnyType(m0.h(p.class, aVar.d(m0.m(cls)), aVar.d(m0.m(cls)))), LinearGradientModule$definition$1$1$5.INSTANCE));
            viewManagerDefinitionBuilder.getProps().put("borderRadii", new ConcreteViewProp("borderRadii", AnyTypeKt.toAnyType(m0.g(float[].class)), LinearGradientModule$definition$1$1$6.INSTANCE));
            moduleDefinitionBuilder.setViewManagerDefinition(viewManagerDefinitionBuilder.build());
            return moduleDefinitionBuilder.build();
        }
        throw new IllegalArgumentException("The module definition may have exported only one view manager.".toString());
    }
}