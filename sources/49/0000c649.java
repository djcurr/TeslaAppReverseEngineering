package zv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes6.dex */
public final class q extends RecyclerView.h<w> {

    /* renamed from: a */
    private final List<String> f61216a;

    /* renamed from: b */
    private final List<String> f61217b;

    /* renamed from: c */
    private final h00.l<String, vz.b0> f61218c;

    /* JADX WARN: Multi-variable type inference failed */
    public q(List<String> countryNames, List<String> countryCodes, h00.l<? super String, vz.b0> onClick) {
        kotlin.jvm.internal.s.g(countryNames, "countryNames");
        kotlin.jvm.internal.s.g(countryCodes, "countryCodes");
        kotlin.jvm.internal.s.g(onClick, "onClick");
        this.f61216a = countryNames;
        this.f61217b = countryCodes;
        this.f61218c = onClick;
    }

    public static /* synthetic */ void a(q qVar, int i11, View view) {
        d(qVar, i11, view);
    }

    public static final void d(q this$0, int i11, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.b().invoke(this$0.f61217b.get(i11));
    }

    public final h00.l<String, vz.b0> b() {
        return this.f61218c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(w holder, final int i11) {
        kotlin.jvm.internal.s.g(holder, "holder");
        holder.b().setText(this.f61216a.get(i11));
        holder.c().setOnClickListener(new View.OnClickListener() { // from class: zv.p
            {
                q.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.a(q.this, i11, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e */
    public w onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(n0.f61184c, parent, false);
        kotlin.jvm.internal.s.f(inflate, "from(parent.context).inf…nt,\n        false\n      )");
        return new w(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f61216a.size();
    }
}