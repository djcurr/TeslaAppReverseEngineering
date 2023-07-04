package wv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk.inquiry.governmentid.network.Id;
import java.util.List;

/* loaded from: classes6.dex */
public final class p extends RecyclerView.h<d0> {

    /* renamed from: a */
    private final List<Id> f56372a;

    /* renamed from: b */
    private final h00.l<Id, vz.b0> f56373b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(List<Id> data, h00.l<? super Id, vz.b0> onClick) {
        kotlin.jvm.internal.s.g(data, "data");
        kotlin.jvm.internal.s.g(onClick, "onClick");
        this.f56372a = data;
        this.f56373b = onClick;
    }

    public static /* synthetic */ void a(p pVar, Id id2, View view) {
        d(pVar, id2, view);
    }

    public static final void d(p this$0, Id id2, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(id2, "$id");
        this$0.b().invoke(id2);
    }

    public final h00.l<Id, vz.b0> b() {
        return this.f56373b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(d0 holder, int i11) {
        kotlin.jvm.internal.s.g(holder, "holder");
        final Id id2 = this.f56372a.get(i11);
        holder.c().setText(holder.d().getContext().getString(id2.d().toLabel()));
        holder.b().setImageResource(id2.d().toIcon());
        holder.d().setOnClickListener(new View.OnClickListener() { // from class: wv.o
            {
                p.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.a(p.this, id2, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e */
    public d0 onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(i0.f56316d, parent, false);
        kotlin.jvm.internal.s.f(inflate, "from(parent.context).inf…nt,\n        false\n      )");
        return new d0(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f56372a.size();
    }
}