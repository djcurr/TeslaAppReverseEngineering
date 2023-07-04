package com.adyen.threeds2.customization;

import com.adyen.threeds2.util.Preconditions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.i18n.MessageBundle;

/* loaded from: classes.dex */
public final class UiCustomization {

    /* renamed from: a  reason: collision with root package name */
    private final Map<ButtonType, ButtonCustomization> f9626a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<? extends Customization>, Customization> f9627b = new HashMap();

    /* loaded from: classes.dex */
    public enum ButtonType {
        VERIFY,
        CONTINUE,
        NEXT,
        CANCEL,
        RESEND
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9628a;

        static {
            int[] iArr = new int[ButtonType.values().length];
            f9628a = iArr;
            try {
                iArr[ButtonType.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9628a[ButtonType.RESEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ButtonCustomization a(ButtonType buttonType) {
        ButtonCustomization buttonCustomization = this.f9626a.get(buttonType);
        if (buttonCustomization == null) {
            ButtonCustomization buttonCustomization2 = new ButtonCustomization();
            this.f9626a.put(buttonType, buttonCustomization2);
            return buttonCustomization2;
        }
        return buttonCustomization;
    }

    public ButtonCustomization getButtonCustomization(ButtonType buttonType) {
        Preconditions.requireNonNull("buttonType", buttonType);
        return a(buttonType);
    }

    public ExpandableInfoCustomization getExpandableInfoCustomization() {
        return (ExpandableInfoCustomization) a(ExpandableInfoCustomization.class);
    }

    public LabelCustomization getLabelCustomization() {
        return (LabelCustomization) a(LabelCustomization.class);
    }

    public ScreenCustomization getScreenCustomization() {
        return (ScreenCustomization) a(ScreenCustomization.class);
    }

    public SelectionItemCustomization getSelectionItemCustomization() {
        return (SelectionItemCustomization) a(SelectionItemCustomization.class);
    }

    public TextBoxCustomization getTextBoxCustomization() {
        return (TextBoxCustomization) a(TextBoxCustomization.class);
    }

    public ToolbarCustomization getToolbarCustomization() {
        return (ToolbarCustomization) a(ToolbarCustomization.class);
    }

    public void setBorderColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((TextBoxCustomization) a(TextBoxCustomization.class)).setBorderColor(str);
        ((SelectionItemCustomization) a(SelectionItemCustomization.class)).setBorderColor(str);
        ((ExpandableInfoCustomization) a(ExpandableInfoCustomization.class)).setBorderColor(str);
    }

    public void setButtonCustomization(ButtonCustomization buttonCustomization, ButtonType buttonType) {
        Preconditions.requireNonNull("buttonType", buttonType);
        this.f9626a.put(buttonType, buttonCustomization);
    }

    public void setExpandableInfoCustomization(ExpandableInfoCustomization expandableInfoCustomization) {
        Preconditions.requireNonNull("expandableInfoCustomization", expandableInfoCustomization);
        this.f9627b.put(ExpandableInfoCustomization.class, expandableInfoCustomization);
    }

    public void setHighlightedBackgroundColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((SelectionItemCustomization) a(SelectionItemCustomization.class)).setHighlightedBackgroundColor(str);
        ((ExpandableInfoCustomization) a(ExpandableInfoCustomization.class)).setHighlightedBackgroundColor(str);
        for (ButtonType buttonType : Arrays.asList(ButtonType.CANCEL, ButtonType.RESEND)) {
            a(buttonType).setBackgroundColor(str);
        }
    }

    public void setLabelCustomization(LabelCustomization labelCustomization) {
        Preconditions.requireNonNull("labelCustomization", labelCustomization);
        this.f9627b.put(LabelCustomization.class, labelCustomization);
    }

    public void setScreenBackgroundColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ScreenCustomization) a(ScreenCustomization.class)).setBackgroundColor(str);
    }

    public void setScreenCustomization(ScreenCustomization screenCustomization) {
        Preconditions.requireNonNull("screenCustomization", screenCustomization);
        this.f9627b.put(ScreenCustomization.class, screenCustomization);
    }

    public void setSelectionItemCustomization(SelectionItemCustomization selectionItemCustomization) {
        Preconditions.requireNonNull("selectionItemCustomization", selectionItemCustomization);
        this.f9627b.put(SelectionItemCustomization.class, selectionItemCustomization);
    }

    public void setStatusBarColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ScreenCustomization) a(ScreenCustomization.class)).setStatusBarColor(str);
    }

    public void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        Preconditions.requireNonNull("textBoxCustomization", textBoxCustomization);
        this.f9627b.put(TextBoxCustomization.class, textBoxCustomization);
    }

    public void setTextColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ScreenCustomization) a(ScreenCustomization.class)).setTextColor(str);
        ((ToolbarCustomization) a(ToolbarCustomization.class)).setTextColor(str);
        a(ButtonType.CANCEL).setTextColor(str);
        LabelCustomization labelCustomization = (LabelCustomization) a(LabelCustomization.class);
        labelCustomization.setTextColor(str);
        labelCustomization.setHeadingTextColor(str);
        labelCustomization.setInputLabelTextColor(str);
        ((TextBoxCustomization) a(TextBoxCustomization.class)).setTextColor(str);
        ((SelectionItemCustomization) a(SelectionItemCustomization.class)).setTextColor(str);
        ExpandableInfoCustomization expandableInfoCustomization = (ExpandableInfoCustomization) a(ExpandableInfoCustomization.class);
        expandableInfoCustomization.setTextColor(str);
        expandableInfoCustomization.setHeadingTextColor(str);
        expandableInfoCustomization.setExpandStateIndicatorColor(str);
    }

    public void setTintColor(String str) {
        ButtonType[] values;
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ToolbarCustomization) a(ToolbarCustomization.class)).setBackgroundColor(str);
        ((SelectionItemCustomization) a(SelectionItemCustomization.class)).setSelectionIndicatorTintColor(str);
        for (ButtonType buttonType : ButtonType.values()) {
            ButtonCustomization a11 = a(buttonType);
            int i11 = a.f9628a[buttonType.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    a11.setBackgroundColor(str);
                } else {
                    a11.setTextColor(str);
                }
            }
        }
    }

    public void setToolbarCustomization(ToolbarCustomization toolbarCustomization) {
        Preconditions.requireNonNull("toolbarCustomization", toolbarCustomization);
        this.f9627b.put(ToolbarCustomization.class, toolbarCustomization);
    }

    public void setToolbarTitle(String str) {
        Preconditions.requireNonEmpty(MessageBundle.TITLE_ENTRY, str);
        ((ToolbarCustomization) a(ToolbarCustomization.class)).setHeaderText(str);
    }

    private <T extends Customization> T a(Class<T> cls) {
        T t11 = (T) this.f9627b.get(cls);
        if (t11 == null) {
            try {
                T newInstance = cls.newInstance();
                this.f9627b.put(cls, newInstance);
                return newInstance;
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Could not access constructor of " + cls.getSimpleName(), e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Could not instantiate " + cls.getSimpleName(), e12);
            }
        }
        return t11;
    }
}