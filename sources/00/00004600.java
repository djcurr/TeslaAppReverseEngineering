package com.plaid.internal.workflow.persistence.database;

import androidx.room.p;
import androidx.room.t0;
import androidx.room.v0;
import androidx.room.y;
import ch.qos.logback.core.joran.action.Action;
import com.plaid.internal.jd;
import com.plaid.internal.kd;
import com.plaid.internal.s6;
import com.plaid.internal.t6;
import com.plaid.internal.v7;
import com.plaid.internal.w7;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t4.b;
import u4.c;
import u4.g;
import v4.g;
import v4.h;

/* loaded from: classes2.dex */
public final class WorkflowDatabase_Impl extends WorkflowDatabase {

    /* renamed from: a  reason: collision with root package name */
    public volatile v7 f19714a;

    /* renamed from: b  reason: collision with root package name */
    public volatile s6 f19715b;

    /* renamed from: c  reason: collision with root package name */
    public volatile jd f19716c;

    /* loaded from: classes2.dex */
    public class a extends v0.a {
        public a(int i11) {
            super(i11);
        }

        @Override // androidx.room.v0.a
        public void createAllTables(g gVar) {
            gVar.u("CREATE TABLE IF NOT EXISTS `workflow_pane` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            gVar.u("CREATE TABLE IF NOT EXISTS `workflow_local_key_values` (`pane_id` TEXT NOT NULL, `key` TEXT NOT NULL, `string` TEXT, `byte_array` BLOB, PRIMARY KEY(`pane_id`, `key`))");
            gVar.u("CREATE TABLE IF NOT EXISTS `workflow_analytics` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `analytics_model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            gVar.u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bbbb42d6a8058409381c7dda80a54606')");
        }

        @Override // androidx.room.v0.a
        public void dropAllTables(g gVar) {
            gVar.u("DROP TABLE IF EXISTS `workflow_pane`");
            gVar.u("DROP TABLE IF EXISTS `workflow_local_key_values`");
            gVar.u("DROP TABLE IF EXISTS `workflow_analytics`");
            if (((t0) WorkflowDatabase_Impl.this).mCallbacks != null) {
                int size = ((t0) WorkflowDatabase_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((t0.b) ((t0) WorkflowDatabase_Impl.this).mCallbacks.get(i11)).b(gVar);
                }
            }
        }

        @Override // androidx.room.v0.a
        public void onCreate(g gVar) {
            if (((t0) WorkflowDatabase_Impl.this).mCallbacks != null) {
                int size = ((t0) WorkflowDatabase_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((t0.b) ((t0) WorkflowDatabase_Impl.this).mCallbacks.get(i11)).a(gVar);
                }
            }
        }

        @Override // androidx.room.v0.a
        public void onOpen(g gVar) {
            ((t0) WorkflowDatabase_Impl.this).mDatabase = gVar;
            WorkflowDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            if (((t0) WorkflowDatabase_Impl.this).mCallbacks != null) {
                int size = ((t0) WorkflowDatabase_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((t0.b) ((t0) WorkflowDatabase_Impl.this).mCallbacks.get(i11)).c(gVar);
                }
            }
        }

        @Override // androidx.room.v0.a
        public void onPostMigrate(g gVar) {
        }

        @Override // androidx.room.v0.a
        public void onPreMigrate(g gVar) {
            c.b(gVar);
        }

        @Override // androidx.room.v0.a
        public v0.b onValidateSchema(g gVar) {
            HashMap hashMap = new HashMap(3);
            hashMap.put("workflow_id", new g.a("workflow_id", "TEXT", true, 1, null, 1));
            hashMap.put("id", new g.a("id", "TEXT", true, 2, null, 1));
            hashMap.put("model", new g.a("model", "BLOB", true, 0, null, 1));
            u4.g gVar2 = new u4.g("workflow_pane", hashMap, new HashSet(0), new HashSet(0));
            u4.g a11 = u4.g.a(gVar, "workflow_pane");
            if (!gVar2.equals(a11)) {
                return new v0.b(false, "workflow_pane(com.plaid.internal.workflow.persistence.database.model.PaneEntity).\n Expected:\n" + gVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("pane_id", new g.a("pane_id", "TEXT", true, 1, null, 1));
            hashMap2.put(Action.KEY_ATTRIBUTE, new g.a(Action.KEY_ATTRIBUTE, "TEXT", true, 2, null, 1));
            hashMap2.put("string", new g.a("string", "TEXT", false, 0, null, 1));
            hashMap2.put("byte_array", new g.a("byte_array", "BLOB", false, 0, null, 1));
            u4.g gVar3 = new u4.g("workflow_local_key_values", hashMap2, new HashSet(0), new HashSet(0));
            u4.g a12 = u4.g.a(gVar, "workflow_local_key_values");
            if (!gVar3.equals(a12)) {
                return new v0.b(false, "workflow_local_key_values(com.plaid.internal.workflow.persistence.database.model.LocalKeyValuesEntity).\n Expected:\n" + gVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap3 = new HashMap(3);
            hashMap3.put("workflow_id", new g.a("workflow_id", "TEXT", true, 1, null, 1));
            hashMap3.put("id", new g.a("id", "TEXT", true, 2, null, 1));
            hashMap3.put("analytics_model", new g.a("analytics_model", "BLOB", true, 0, null, 1));
            u4.g gVar4 = new u4.g("workflow_analytics", hashMap3, new HashSet(0), new HashSet(0));
            u4.g a13 = u4.g.a(gVar, "workflow_analytics");
            if (!gVar4.equals(a13)) {
                return new v0.b(false, "workflow_analytics(com.plaid.internal.workflow.persistence.database.model.WorkflowAnalyticsEntity).\n Expected:\n" + gVar4 + "\n Found:\n" + a13);
            }
            return new v0.b(true, null);
        }
    }

    @Override // androidx.room.t0
    public void clearAllTables() {
        assertNotMainThread();
        v4.g W0 = getOpenHelper().W0();
        try {
            beginTransaction();
            W0.u("DELETE FROM `workflow_pane`");
            W0.u("DELETE FROM `workflow_local_key_values`");
            W0.u("DELETE FROM `workflow_analytics`");
            setTransactionSuccessful();
        } finally {
            endTransaction();
            W0.a1("PRAGMA wal_checkpoint(FULL)").close();
            if (!W0.s1()) {
                W0.u("VACUUM");
            }
        }
    }

    @Override // androidx.room.t0
    public y createInvalidationTracker() {
        return new y(this, new HashMap(0), new HashMap(0), "workflow_pane", "workflow_local_key_values", "workflow_analytics");
    }

    @Override // androidx.room.t0
    public h createOpenHelper(p pVar) {
        return pVar.f5805a.a(h.b.a(pVar.f5806b).c(pVar.f5807c).b(new v0(pVar, new a(3), "bbbb42d6a8058409381c7dda80a54606", "b05e367cc67e6caaadf5a14d5c557670")).a());
    }

    @Override // androidx.room.t0
    public List<b> getAutoMigrations(Map<Class<? extends t4.a>, t4.a> map) {
        return Arrays.asList(new b[0]);
    }

    @Override // androidx.room.t0
    public Set<Class<? extends t4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.t0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(v7.class, Collections.emptyList());
        hashMap.put(s6.class, Collections.emptyList());
        hashMap.put(jd.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public jd c() {
        jd jdVar;
        if (this.f19716c != null) {
            return this.f19716c;
        }
        synchronized (this) {
            if (this.f19716c == null) {
                this.f19716c = new kd(this);
            }
            jdVar = this.f19716c;
        }
        return jdVar;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public s6 a() {
        s6 s6Var;
        if (this.f19715b != null) {
            return this.f19715b;
        }
        synchronized (this) {
            if (this.f19715b == null) {
                this.f19715b = new t6(this);
            }
            s6Var = this.f19715b;
        }
        return s6Var;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public v7 b() {
        v7 v7Var;
        if (this.f19714a != null) {
            return this.f19714a;
        }
        synchronized (this) {
            if (this.f19714a == null) {
                this.f19714a = new w7(this);
            }
            v7Var = this.f19714a;
        }
        return v7Var;
    }
}