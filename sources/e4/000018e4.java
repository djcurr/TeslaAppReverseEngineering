package com.facebook.react.modules.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.facebook.react.modules.dialog.DialogModule;
import org.spongycastle.i18n.MessageBundle;

/* loaded from: classes3.dex */
public class a extends e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final DialogModule.b f12020a;

    public a() {
        this.f12020a = null;
    }

    public static Dialog a(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString(MessageBundle.TITLE_ENTRY));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return title.create();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i11) {
        DialogModule.b bVar = this.f12020a;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i11);
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        return a(getActivity(), getArguments(), this);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.b bVar = this.f12020a;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }

    public a(DialogModule.b bVar, Bundle bundle) {
        this.f12020a = bVar;
        setArguments(bundle);
    }
}