package expo.modules.kotlin.views;

import android.content.Context;
import android.view.View;
import expo.modules.kotlin.modules.DefinitionMarker;
import expo.modules.kotlin.types.AnyTypeKt;
import h00.l;
import h00.p;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bC\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J.\u0010\n\u001a\u00020\t\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u0014\b\b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087\bø\u0001\u0000J.\u0010\u000b\u001a\u00020\t\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u0014\b\b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000J.\u0010\f\u001a\u00020\t\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u0014\b\b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0087\bø\u0001\u0000J.\u0010\r\u001a\u00020\t\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u0014\b\b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0086\bø\u0001\u0000JD\u0010\u0012\u001a\u00020\t\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004\"\u0006\b\u0001\u0010\u000e\u0018\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u001a\b\b\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\u0011H\u0087\bø\u0001\u0000JD\u0010\u0013\u001a\u00020\t\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004\"\u0006\b\u0001\u0010\u000e\u0018\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u001a\b\b\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\u0011H\u0086\bø\u0001\u0000J#\u0010\u0016\u001a\u00020\t2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0014\"\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\t2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0014\"\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0017J \u0010\u001a\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u0006H\u0087\bø\u0001\u0000J \u0010\u001b\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u0006H\u0086\bø\u0001\u0000R2\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R4\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0%8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010$\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010/\u001a\u0004\u0018\u00010.8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010$\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R6\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010$\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R6\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\f\u0010:\u0012\u0004\bB\u0010$\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006D"}, d2 = {"Lexpo/modules/kotlin/views/ViewManagerDefinitionBuilder;", "", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "build", "Landroid/view/View;", "ViewType", "Lkotlin/Function1;", "Landroid/content/Context;", "body", "Lvz/b0;", "view", "View", "onViewDestroys", "OnViewDestroys", "PropType", "", "name", "Lkotlin/Function2;", "prop", "Prop", "", "callbacks", "events", "([Ljava/lang/String;)V", "Events", "Lexpo/modules/kotlin/views/ViewGroupDefinitionBuilder;", "groupView", "GroupView", "Ljava/lang/Class;", "viewType", "Ljava/lang/Class;", "getViewType", "()Ljava/lang/Class;", "setViewType", "(Ljava/lang/Class;)V", "getViewType$annotations", "()V", "", "Lexpo/modules/kotlin/views/AnyViewProp;", "props", "Ljava/util/Map;", "getProps", "()Ljava/util/Map;", "setProps", "(Ljava/util/Map;)V", "getProps$annotations", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "viewGroupDefinition", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "setViewGroupDefinition", "(Lexpo/modules/kotlin/views/ViewGroupDefinition;)V", "getViewGroupDefinition$annotations", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "callbacksDefinition", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "viewFactory", "Lh00/l;", "getViewFactory", "()Lh00/l;", "setViewFactory", "(Lh00/l;)V", "getViewFactory$annotations", "getOnViewDestroys", "setOnViewDestroys", "getOnViewDestroys$annotations", "<init>", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
@DefinitionMarker
/* loaded from: classes5.dex */
public final class ViewManagerDefinitionBuilder {
    private CallbacksDefinition callbacksDefinition;
    private l<? super View, b0> onViewDestroys;
    private Map<String, AnyViewProp> props = new LinkedHashMap();
    private l<? super Context, ? extends View> viewFactory;
    private ViewGroupDefinition viewGroupDefinition;
    private Class<? extends View> viewType;

    public static /* synthetic */ void getOnViewDestroys$annotations() {
    }

    public static /* synthetic */ void getProps$annotations() {
    }

    public static /* synthetic */ void getViewFactory$annotations() {
    }

    public static /* synthetic */ void getViewGroupDefinition$annotations() {
    }

    public static /* synthetic */ void getViewType$annotations() {
    }

    public final void Events(String... callbacks) {
        s.g(callbacks, "callbacks");
        this.callbacksDefinition = new CallbacksDefinition(callbacks);
    }

    public final void GroupView(l<? super ViewGroupDefinitionBuilder, b0> body) {
        s.g(body, "body");
        if (getViewGroupDefinition() == null) {
            ViewGroupDefinitionBuilder viewGroupDefinitionBuilder = new ViewGroupDefinitionBuilder();
            body.invoke(viewGroupDefinitionBuilder);
            setViewGroupDefinition(viewGroupDefinitionBuilder.build());
            return;
        }
        throw new IllegalArgumentException("The viewManager definition may have exported only one groupView definition.".toString());
    }

    public final /* synthetic */ <ViewType extends View> void OnViewDestroys(l<? super ViewType, b0> body) {
        s.g(body, "body");
        s.l();
        setOnViewDestroys(new ViewManagerDefinitionBuilder$OnViewDestroys$1(body));
    }

    public final /* synthetic */ <ViewType extends View, PropType> void Prop(String name, p<? super ViewType, ? super PropType, b0> body) {
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyViewProp> props = getProps();
        s.m(6, "PropType");
        props.put(name, new ConcreteViewProp(name, AnyTypeKt.toAnyType(null), body));
    }

    public final /* synthetic */ <ViewType extends View> void View(l<? super Context, ? extends ViewType> body) {
        s.g(body, "body");
        s.m(4, "ViewType");
        setViewType(View.class);
        setViewFactory(body);
    }

    public final ViewManagerDefinition build() {
        l<? super Context, ? extends View> lVar = this.viewFactory;
        if (lVar != null) {
            Class<? extends View> cls = this.viewType;
            if (cls != null) {
                return new ViewManagerDefinition(lVar, cls, this.props, this.onViewDestroys, this.callbacksDefinition, this.viewGroupDefinition);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void events(String... callbacks) {
        s.g(callbacks, "callbacks");
        Events((String[]) Arrays.copyOf(callbacks, callbacks.length));
    }

    public final l<View, b0> getOnViewDestroys() {
        return this.onViewDestroys;
    }

    public final Map<String, AnyViewProp> getProps() {
        return this.props;
    }

    public final l<Context, View> getViewFactory() {
        return this.viewFactory;
    }

    public final ViewGroupDefinition getViewGroupDefinition() {
        return this.viewGroupDefinition;
    }

    public final Class<? extends View> getViewType() {
        return this.viewType;
    }

    public final void groupView(l<? super ViewGroupDefinitionBuilder, b0> body) {
        s.g(body, "body");
        if (getViewGroupDefinition() == null) {
            ViewGroupDefinitionBuilder viewGroupDefinitionBuilder = new ViewGroupDefinitionBuilder();
            body.invoke(viewGroupDefinitionBuilder);
            setViewGroupDefinition(viewGroupDefinitionBuilder.build());
            return;
        }
        throw new IllegalArgumentException("The viewManager definition may have exported only one groupView definition.".toString());
    }

    public final /* synthetic */ <ViewType extends View> void onViewDestroys(l<? super ViewType, b0> body) {
        s.g(body, "body");
        s.l();
        setOnViewDestroys(new ViewManagerDefinitionBuilder$onViewDestroys$$inlined$OnViewDestroys$1(body));
    }

    public final /* synthetic */ <ViewType extends View, PropType> void prop(String name, p<? super ViewType, ? super PropType, b0> body) {
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyViewProp> props = getProps();
        s.m(6, "PropType");
        props.put(name, new ConcreteViewProp(name, AnyTypeKt.toAnyType(null), body));
    }

    public final void setOnViewDestroys(l<? super View, b0> lVar) {
        this.onViewDestroys = lVar;
    }

    public final void setProps(Map<String, AnyViewProp> map) {
        s.g(map, "<set-?>");
        this.props = map;
    }

    public final void setViewFactory(l<? super Context, ? extends View> lVar) {
        this.viewFactory = lVar;
    }

    public final void setViewGroupDefinition(ViewGroupDefinition viewGroupDefinition) {
        this.viewGroupDefinition = viewGroupDefinition;
    }

    public final void setViewType(Class<? extends View> cls) {
        this.viewType = cls;
    }

    public final /* synthetic */ <ViewType extends View> void view(l<? super Context, ? extends ViewType> body) {
        s.g(body, "body");
        s.m(4, "ViewType");
        setViewType(View.class);
        setViewFactory(body);
    }
}