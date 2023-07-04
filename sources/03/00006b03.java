package expo.modules.kotlin.modules;

import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/modules/Module;", "Lkotlin/Function1;", "Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;", "Lvz/b0;", "block", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "ModuleDefinition", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleKt {
    public static final ModuleDefinitionData ModuleDefinition(Module module, l<? super ModuleDefinitionBuilder, b0> block) {
        s.g(module, "<this>");
        s.g(block, "block");
        ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(module);
        block.invoke(moduleDefinitionBuilder);
        return moduleDefinitionBuilder.build();
    }
}