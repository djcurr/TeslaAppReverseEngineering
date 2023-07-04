package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import expo.modules.kotlin.modules.DefinitionMarker;
import h00.l;
import h00.p;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002JF\u0010\f\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004\"\n\b\u0001\u0010\u0007\u0018\u0001*\u00020\u00062 \b\b\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0087\bø\u0001\u0000JF\u0010\r\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004\"\n\b\u0001\u0010\u0007\u0018\u0001*\u00020\u00062 \b\b\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\bø\u0001\u0000J.\u0010\u000f\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u0014\b\b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u000eH\u0087\bø\u0001\u0000J.\u0010\u0010\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u0014\b\b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u000eH\u0086\bø\u0001\u0000JB\u0010\u0012\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004\"\n\b\u0001\u0010\u0007\u0018\u0001*\u00020\u00062\u001c\b\b\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0011H\u0087\bø\u0001\u0000JB\u0010\u0013\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004\"\n\b\u0001\u0010\u0007\u0018\u0001*\u00020\u00062\u001c\b\b\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0011H\u0086\bø\u0001\u0000J4\u0010\u0014\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u001a\b\b\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0011H\u0087\bø\u0001\u0000J4\u0010\u0015\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u001a\b\b\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0011H\u0086\bø\u0001\u0000J@\u0010\u0016\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004\"\n\b\u0001\u0010\u0007\u0018\u0001*\u00020\u00062\u001a\b\b\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u0011H\u0087\bø\u0001\u0000J@\u0010\u0017\u001a\u00020\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004\"\n\b\u0001\u0010\u0007\u0018\u0001*\u00020\u00062\u001a\b\b\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u0011H\u0086\bø\u0001\u0000RH\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eRD\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0011j\u0004\u0018\u0001`!8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010 \u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R<\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u000ej\u0004\u0018\u0001`)8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u0010 \u001a\u0004\b,\u0010-\"\u0004\b.\u0010/RB\u00102\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011j\u0004\u0018\u0001`18\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b2\u0010#\u0012\u0004\b5\u0010 \u001a\u0004\b3\u0010%\"\u0004\b4\u0010'RB\u00107\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011j\u0004\u0018\u0001`68\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b7\u0010#\u0012\u0004\b:\u0010 \u001a\u0004\b8\u0010%\"\u0004\b9\u0010'\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006<"}, d2 = {"Lexpo/modules/kotlin/views/ViewGroupDefinitionBuilder;", "", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "build", "Landroid/view/ViewGroup;", "ParentViewType", "Landroid/view/View;", "ChildViewType", "Lkotlin/Function3;", "", "Lvz/b0;", "body", "addChildView", "AddChildView", "Lkotlin/Function1;", "getChildCount", "GetChildCount", "Lkotlin/Function2;", "getChildViewAt", "GetChildViewAt", "removeChildViewAt", "RemoveChildViewAt", "removeChildView", "RemoveChildView", "Lexpo/modules/kotlin/views/AddViewAction;", "addViewAction", "Lh00/q;", "getAddViewAction", "()Lh00/q;", "setAddViewAction", "(Lh00/q;)V", "getAddViewAction$annotations", "()V", "Lexpo/modules/kotlin/views/GetChildAtAction;", "getChildAtAction", "Lh00/p;", "getGetChildAtAction", "()Lh00/p;", "setGetChildAtAction", "(Lh00/p;)V", "getGetChildAtAction$annotations", "Lexpo/modules/kotlin/views/GetChildCountAction;", "getChildCountAction", "Lh00/l;", "getGetChildCountAction", "()Lh00/l;", "setGetChildCountAction", "(Lh00/l;)V", "getGetChildCountAction$annotations", "Lexpo/modules/kotlin/views/RemoveViewAction;", "removeViewAction", "getRemoveViewAction", "setRemoveViewAction", "getRemoveViewAction$annotations", "Lexpo/modules/kotlin/views/RemoveViewAtAction;", "removeViewAtAction", "getRemoveViewAtAction", "setRemoveViewAtAction", "getRemoveViewAtAction$annotations", "<init>", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
@DefinitionMarker
/* loaded from: classes5.dex */
public final class ViewGroupDefinitionBuilder {
    private q<? super ViewGroup, ? super View, ? super Integer, b0> addViewAction;
    private p<? super ViewGroup, ? super Integer, ? extends View> getChildAtAction;
    private l<? super ViewGroup, Integer> getChildCountAction;
    private p<? super ViewGroup, ? super View, b0> removeViewAction;
    private p<? super ViewGroup, ? super Integer, b0> removeViewAtAction;

    public static /* synthetic */ void getAddViewAction$annotations() {
    }

    public static /* synthetic */ void getGetChildAtAction$annotations() {
    }

    public static /* synthetic */ void getGetChildCountAction$annotations() {
    }

    public static /* synthetic */ void getRemoveViewAction$annotations() {
    }

    public static /* synthetic */ void getRemoveViewAtAction$annotations() {
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup, ChildViewType extends View> void AddChildView(q<? super ParentViewType, ? super ChildViewType, ? super Integer, b0> body) {
        s.g(body, "body");
        s.l();
        setAddViewAction(new ViewGroupDefinitionBuilder$AddChildView$1(body));
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup> void GetChildCount(l<? super ParentViewType, Integer> body) {
        s.g(body, "body");
        s.l();
        setGetChildCountAction(new ViewGroupDefinitionBuilder$GetChildCount$1(body));
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup, ChildViewType extends View> void GetChildViewAt(p<? super ParentViewType, ? super Integer, ? extends ChildViewType> body) {
        s.g(body, "body");
        s.l();
        setGetChildAtAction(new ViewGroupDefinitionBuilder$GetChildViewAt$1(body));
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup, ChildViewType extends View> void RemoveChildView(p<? super ParentViewType, ? super ChildViewType, b0> body) {
        s.g(body, "body");
        s.l();
        setRemoveViewAction(new ViewGroupDefinitionBuilder$RemoveChildView$1(body));
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup> void RemoveChildViewAt(p<? super ParentViewType, ? super Integer, b0> body) {
        s.g(body, "body");
        s.l();
        setRemoveViewAtAction(new ViewGroupDefinitionBuilder$RemoveChildViewAt$1(body));
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup, ChildViewType extends View> void addChildView(q<? super ParentViewType, ? super ChildViewType, ? super Integer, b0> body) {
        s.g(body, "body");
        s.l();
        setAddViewAction(new ViewGroupDefinitionBuilder$addChildView$$inlined$AddChildView$1(body));
    }

    public final ViewGroupDefinition build() {
        return new ViewGroupDefinition(this.addViewAction, this.getChildAtAction, this.getChildCountAction, this.removeViewAction, this.removeViewAtAction);
    }

    public final q<ViewGroup, View, Integer, b0> getAddViewAction() {
        return this.addViewAction;
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup> void getChildCount(l<? super ParentViewType, Integer> body) {
        s.g(body, "body");
        s.l();
        setGetChildCountAction(new ViewGroupDefinitionBuilder$getChildCount$$inlined$GetChildCount$1(body));
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup, ChildViewType extends View> void getChildViewAt(p<? super ParentViewType, ? super Integer, ? extends ChildViewType> body) {
        s.g(body, "body");
        s.l();
        setGetChildAtAction(new ViewGroupDefinitionBuilder$getChildViewAt$$inlined$GetChildViewAt$1(body));
    }

    public final p<ViewGroup, Integer, View> getGetChildAtAction() {
        return this.getChildAtAction;
    }

    public final l<ViewGroup, Integer> getGetChildCountAction() {
        return this.getChildCountAction;
    }

    public final p<ViewGroup, View, b0> getRemoveViewAction() {
        return this.removeViewAction;
    }

    public final p<ViewGroup, Integer, b0> getRemoveViewAtAction() {
        return this.removeViewAtAction;
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup, ChildViewType extends View> void removeChildView(p<? super ParentViewType, ? super ChildViewType, b0> body) {
        s.g(body, "body");
        s.l();
        setRemoveViewAction(new ViewGroupDefinitionBuilder$removeChildView$$inlined$RemoveChildView$1(body));
    }

    public final /* synthetic */ <ParentViewType extends ViewGroup> void removeChildViewAt(p<? super ParentViewType, ? super Integer, b0> body) {
        s.g(body, "body");
        s.l();
        setRemoveViewAtAction(new ViewGroupDefinitionBuilder$removeChildViewAt$$inlined$RemoveChildViewAt$1(body));
    }

    public final void setAddViewAction(q<? super ViewGroup, ? super View, ? super Integer, b0> qVar) {
        this.addViewAction = qVar;
    }

    public final void setGetChildAtAction(p<? super ViewGroup, ? super Integer, ? extends View> pVar) {
        this.getChildAtAction = pVar;
    }

    public final void setGetChildCountAction(l<? super ViewGroup, Integer> lVar) {
        this.getChildCountAction = lVar;
    }

    public final void setRemoveViewAction(p<? super ViewGroup, ? super View, b0> pVar) {
        this.removeViewAction = pVar;
    }

    public final void setRemoveViewAtAction(p<? super ViewGroup, ? super Integer, b0> pVar) {
        this.removeViewAtAction = pVar;
    }
}