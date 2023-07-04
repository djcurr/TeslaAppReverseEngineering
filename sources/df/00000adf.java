package atd.n0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.adyen.threeds2.R;
import com.adyen.threeds2.customization.ButtonCustomization;
import com.adyen.threeds2.customization.Customization;
import com.adyen.threeds2.customization.ExpandableInfoCustomization;
import com.adyen.threeds2.customization.LabelCustomization;
import com.adyen.threeds2.customization.ScreenCustomization;
import com.adyen.threeds2.customization.SelectionItemCustomization;
import com.adyen.threeds2.customization.TextBoxCustomization;
import com.adyen.threeds2.customization.ToolbarCustomization;
import com.adyen.threeds2.customization.UiCustomization;
import com.adyen.threeds2.internal.ui.widget.DividerView;
import com.adyen.threeds2.internal.ui.widget.ExpandableInfoTextView;
import com.adyen.threeds2.internal.ui.widget.ToolbarView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final UiCustomization f6905a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: atd.n0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0125a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6906a;

        static {
            int[] iArr = new int[DividerView.b.values().length];
            f6906a = iArr;
            try {
                iArr[DividerView.b.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6906a[DividerView.b.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(UiCustomization uiCustomization) {
        this.f6905a = uiCustomization;
    }

    private void b(Button button, ButtonCustomization buttonCustomization) {
        if (buttonCustomization == null) {
            return;
        }
        Integer parseHexColorCode = Customization.parseHexColorCode(buttonCustomization.getBackgroundColor());
        if (parseHexColorCode != null) {
            a(button.getBackground(), parseHexColorCode, true);
        }
        a(button, buttonCustomization);
    }

    private void c(Button button, ButtonCustomization buttonCustomization) {
        if (buttonCustomization == null) {
            return;
        }
        Integer parseHexColorCode = Customization.parseHexColorCode(buttonCustomization.getBackgroundColor());
        if (parseHexColorCode != null) {
            a(button.getBackground(), parseHexColorCode);
        }
        a(button, buttonCustomization);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Window window) {
        ScreenCustomization screenCustomization;
        Integer parseHexColorCode;
        UiCustomization uiCustomization = this.f6905a;
        if (uiCustomization == null || (screenCustomization = uiCustomization.getScreenCustomization()) == null) {
            return;
        }
        Integer parseHexColorCode2 = Customization.parseHexColorCode(screenCustomization.getBackgroundColor());
        if (parseHexColorCode2 != null) {
            ColorDrawable colorDrawable = new ColorDrawable(parseHexColorCode2.intValue());
            if (Build.VERSION.SDK_INT >= 21) {
                colorDrawable.setTint(parseHexColorCode2.intValue());
            }
            window.setBackgroundDrawable(colorDrawable);
        }
        if (Build.VERSION.SDK_INT < 21 || (parseHexColorCode = Customization.parseHexColorCode(screenCustomization.getStatusBarColor())) == null) {
            return;
        }
        window.setStatusBarColor(parseHexColorCode.intValue());
    }

    private void b(Drawable drawable, Integer num) {
        if (drawable == null || num == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            if (drawable instanceof InsetDrawable) {
                b(((InsetDrawable) drawable).getDrawable(), num);
            } else if (drawable instanceof StateListDrawable) {
                DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    for (int i11 = 0; i11 < drawableContainerState.getChildren().length; i11++) {
                        b(drawableContainerState.getChild(i11), num);
                    }
                }
            } else if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setCornerRadius(num.intValue());
            }
        }
        if (Build.VERSION.SDK_INT < 21 || !(drawable instanceof RippleDrawable)) {
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) drawable;
        b(rippleDrawable.getNumberOfLayers() > 0 ? rippleDrawable.getDrawable(0) : null, num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, AttributeSet attributeSet) {
        if (this.f6905a == null) {
            return;
        }
        int styleAttribute = attributeSet.getStyleAttribute();
        if (view instanceof ProgressBar) {
            a((ProgressBar) view, styleAttribute);
        } else if (view instanceof CompoundButton) {
            a((CompoundButton) view);
        } else if (view instanceof Button) {
            a((Button) view, styleAttribute);
        } else if (view instanceof EditText) {
            a((EditText) view);
        } else if (view instanceof TextView) {
            a((TextView) view, styleAttribute);
        } else if (view instanceof ToolbarView) {
            a((ToolbarView) view);
        } else if (view instanceof ExpandableInfoTextView) {
            a((ExpandableInfoTextView) view);
        } else if (view instanceof DividerView) {
            a((DividerView) view);
        } else if (view instanceof ViewGroup) {
            a(view, styleAttribute);
        }
    }

    private void a(ProgressBar progressBar, int i11) {
        ToolbarCustomization toolbarCustomization;
        Integer parseHexColorCode;
        if (i11 != R.style.Widget_ThreeDS2_ProgressBar || (toolbarCustomization = this.f6905a.getToolbarCustomization()) == null || (parseHexColorCode = Customization.parseHexColorCode(toolbarCustomization.getBackgroundColor())) == null) {
            return;
        }
        a(progressBar.getIndeterminateDrawable(), parseHexColorCode);
    }

    private void a(CompoundButton compoundButton) {
        Integer parseHexColorCode;
        SelectionItemCustomization selectionItemCustomization = this.f6905a.getSelectionItemCustomization();
        if (selectionItemCustomization == null || Build.VERSION.SDK_INT < 21 || (parseHexColorCode = Customization.parseHexColorCode(selectionItemCustomization.getSelectionIndicatorTintColor())) == null) {
            return;
        }
        compoundButton.setButtonTintList(ColorStateList.valueOf(parseHexColorCode.intValue()));
    }

    private void a(Button button, int i11) {
        if (i11 == R.style.Widget_ThreeDS2_Button_Borderless_Cancel) {
            b(button, this.f6905a.getButtonCustomization(UiCustomization.ButtonType.CANCEL));
        } else if (i11 == R.style.Widget_ThreeDS2_Button_Borderless_Resend) {
            b(button, this.f6905a.getButtonCustomization(UiCustomization.ButtonType.RESEND));
        } else if (i11 == R.style.Widget_ThreeDS2_Button_Colored_Verify) {
            c(button, this.f6905a.getButtonCustomization(UiCustomization.ButtonType.VERIFY));
        } else if (i11 == R.style.Widget_ThreeDS2_Button_Colored_Continue) {
            c(button, this.f6905a.getButtonCustomization(UiCustomization.ButtonType.CONTINUE));
        } else if (i11 == R.style.Widget_ThreeDS2_Button_Colored_Next) {
            c(button, this.f6905a.getButtonCustomization(UiCustomization.ButtonType.NEXT));
        }
    }

    private void a(Button button, ButtonCustomization buttonCustomization) {
        int cornerRadius = buttonCustomization.getCornerRadius();
        if (cornerRadius >= 0) {
            b(button.getBackground(), Integer.valueOf(cornerRadius));
        }
        a((TextView) button, (Customization) buttonCustomization);
    }

    private void a(EditText editText) {
        TextBoxCustomization textBoxCustomization = this.f6905a.getTextBoxCustomization();
        if (textBoxCustomization == null) {
            return;
        }
        Integer parseHexColorCode = Customization.parseHexColorCode(textBoxCustomization.getBorderColor());
        if (parseHexColorCode != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                editText.setBackgroundTintList(ColorStateList.valueOf(parseHexColorCode.intValue()));
            } else {
                a(editText.getBackground(), parseHexColorCode);
            }
        }
        a(editText, textBoxCustomization);
    }

    private void a(TextView textView, int i11) {
        if (i11 == R.style.TextAppearance_ThreeDS2_Widget_Toolbar_Title) {
            a(textView, this.f6905a.getToolbarCustomization());
        } else if (i11 == R.style.TextAppearance_ThreeDS2_Heading) {
            LabelCustomization labelCustomization = this.f6905a.getLabelCustomization();
            a(textView, labelCustomization.getHeadingTextColor(), labelCustomization.getHeadingTextFontName(), labelCustomization.getHeadingTextFontSize());
        } else if (i11 == R.style.TextAppearance_ThreeDS2_InputLabel) {
            LabelCustomization labelCustomization2 = this.f6905a.getLabelCustomization();
            a(textView, labelCustomization2.getInputLabelTextColor(), labelCustomization2.getInputLabelTextFontName(), labelCustomization2.getInputLabelTextFontSize());
        } else if (i11 == R.style.TextAppearance_ThreeDS2_SelectItem_Title) {
            a(textView, this.f6905a.getSelectionItemCustomization());
        } else if (i11 == R.style.TextAppearance_ThreeDS2_Widget_ExpandableInfoText_Title) {
            ExpandableInfoCustomization expandableInfoCustomization = this.f6905a.getExpandableInfoCustomization();
            a(textView, expandableInfoCustomization.getHeadingTextColor(), expandableInfoCustomization.getHeadingTextFontName(), expandableInfoCustomization.getHeadingTextFontSize());
        } else if (i11 == R.style.TextAppearance_ThreeDS2_Widget_ExpandableInfoText_Info) {
            a(textView, this.f6905a.getExpandableInfoCustomization());
        } else {
            a(textView, this.f6905a.getLabelCustomization());
        }
    }

    private void a(TextView textView, Customization customization) {
        if (customization == null) {
            return;
        }
        a(textView, customization.getTextColor(), customization.getTextFontName(), customization.getTextFontSize());
    }

    private void a(TextView textView, String str, String str2, int i11) {
        Integer parseHexColorCode = Customization.parseHexColorCode(str);
        if (parseHexColorCode != null) {
            textView.setTextColor(parseHexColorCode.intValue());
        }
        Typeface parseTypeface = Customization.parseTypeface(textView.getContext(), str2);
        if (parseTypeface != null) {
            textView.setTypeface(parseTypeface);
        }
        if (i11 > 0) {
            textView.setTextSize(i11);
        }
    }

    private void a(ToolbarView toolbarView) {
        ToolbarCustomization toolbarCustomization = this.f6905a.getToolbarCustomization();
        if (toolbarCustomization == null) {
            return;
        }
        Integer parseHexColorCode = Customization.parseHexColorCode(toolbarCustomization.getBackgroundColor());
        if (parseHexColorCode != null) {
            toolbarView.setBackgroundColor(parseHexColorCode.intValue());
        }
        String headerText = toolbarCustomization.getHeaderText();
        if (!TextUtils.isEmpty(headerText)) {
            toolbarView.setTitle(headerText);
        }
        String buttonText = toolbarCustomization.getButtonText();
        if (!TextUtils.isEmpty(buttonText)) {
            toolbarView.setCancelButtonText(buttonText);
        }
        Integer parseHexColorCode2 = Customization.parseHexColorCode(toolbarCustomization.getTextColor());
        if (parseHexColorCode2 != null) {
            toolbarView.setTitleTextColor(parseHexColorCode2.intValue());
            toolbarView.setCancelButtonTextColor(parseHexColorCode2.intValue());
        }
        Typeface parseTypeface = Customization.parseTypeface(toolbarView.getContext(), toolbarCustomization.getTextFontName());
        if (parseTypeface != null) {
            toolbarView.setTitleTypeface(parseTypeface);
            toolbarView.setCancelButtonTextTypeface(parseTypeface);
        }
        int textFontSize = toolbarCustomization.getTextFontSize();
        if (textFontSize > 0) {
            toolbarView.setTitleFontSize(Integer.valueOf(textFontSize));
        }
    }

    private void a(ExpandableInfoTextView expandableInfoTextView) {
        ExpandableInfoCustomization expandableInfoCustomization = this.f6905a.getExpandableInfoCustomization();
        if (expandableInfoCustomization == null) {
            return;
        }
        Integer parseHexColorCode = Customization.parseHexColorCode(expandableInfoCustomization.getHighlightedBackgroundColor());
        if (parseHexColorCode != null) {
            expandableInfoTextView.setHeaderBackgroundColor(parseHexColorCode.intValue());
        }
        Integer parseHexColorCode2 = Customization.parseHexColorCode(expandableInfoCustomization.getExpandedStateIndicatorColor());
        if (parseHexColorCode2 != null) {
            expandableInfoTextView.setStateIndicatorColor(parseHexColorCode2.intValue());
        }
    }

    private void a(View view, int i11) {
        SelectionItemCustomization selectionItemCustomization;
        Integer parseHexColorCode;
        if (i11 != R.style.Widget_ThreeDS2_SelectItem || (selectionItemCustomization = this.f6905a.getSelectionItemCustomization()) == null || (parseHexColorCode = Customization.parseHexColorCode(selectionItemCustomization.getHighlightedBackgroundColor())) == null) {
            return;
        }
        a(view.getBackground(), parseHexColorCode, true);
    }

    private void a(DividerView dividerView) {
        ExpandableInfoCustomization expandableInfoCustomization;
        int id2 = dividerView.getId();
        if (id2 == R.id.dividerView_info) {
            ExpandableInfoCustomization expandableInfoCustomization2 = this.f6905a.getExpandableInfoCustomization();
            if (expandableInfoCustomization2 != null) {
                a(dividerView, expandableInfoCustomization2.getBorderColor(), expandableInfoCustomization2.getBorderWidth());
            }
        } else if (id2 == R.id.dividerView_select) {
            SelectionItemCustomization selectionItemCustomization = this.f6905a.getSelectionItemCustomization();
            if (selectionItemCustomization != null) {
                a(dividerView, selectionItemCustomization.getBorderColor(), selectionItemCustomization.getBorderWidth());
            }
        } else if (id2 != R.id.dividerView_logos || (expandableInfoCustomization = this.f6905a.getExpandableInfoCustomization()) == null) {
        } else {
            a(dividerView, expandableInfoCustomization.getBorderColor(), expandableInfoCustomization.getBorderWidth());
        }
    }

    private void a(DividerView dividerView, String str, int i11) {
        Integer parseHexColorCode = Customization.parseHexColorCode(str);
        if (parseHexColorCode != null) {
            dividerView.setColor(parseHexColorCode.intValue());
        }
        if (i11 >= 0) {
            int i12 = C0125a.f6906a[dividerView.getOrientation().ordinal()];
            if (i12 == 1) {
                dividerView.setThickness(i11);
            } else if (i12 != 2) {
            } else {
                dividerView.setThickness(i11);
            }
        }
    }

    private void a(Drawable drawable, Integer num) {
        a(drawable, num, false);
    }

    private void a(Drawable drawable, Integer num, boolean z11) {
        if (drawable == null || num == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (drawable instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                if (z11) {
                    rippleDrawable.setColor(ColorStateList.valueOf(num.intValue()));
                }
                a(rippleDrawable.getNumberOfLayers() > 0 ? rippleDrawable.getDrawable(0) : null, num);
            } else if (drawable instanceof InsetDrawable) {
                a(((InsetDrawable) drawable).getDrawable(), num);
            } else if (drawable instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) drawable;
                colorDrawable.setTint(num.intValue());
                colorDrawable.setColor(num.intValue());
            } else {
                drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        } else if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(num.intValue());
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}