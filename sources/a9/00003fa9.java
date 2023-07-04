package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import b6.g;
import com.google.protobuf.ByteString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.wa;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class a4 {

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18164a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.SDK_ASSET_HEADER_ACCOUNT_ADMIN.ordinal()] = 1;
            iArr[d.SDK_ASSET_HEADER_ACCOUNT_NUMBER_CONFIRMED.ordinal()] = 2;
            iArr[d.SDK_ASSET_HEADER_ACCOUNT_NUMBER_HELP.ordinal()] = 3;
            iArr[d.SDK_ASSET_HEADER_ACCOUNT_NUMBER_SEARCH.ordinal()] = 4;
            iArr[d.SDK_ASSET_HEADER_CONNECT_WITH_PLAID.ordinal()] = 5;
            iArr[d.SDK_ASSET_HEADER_FINAL_ERROR.ordinal()] = 6;
            iArr[d.SDK_ASSET_HEADER_FINAL_SUCCESS.ordinal()] = 7;
            iArr[d.SDK_ASSET_HEADER_FIRST_DEPOSIT.ordinal()] = 8;
            iArr[d.SDK_ASSET_HEADER_LINK_BANK.ordinal()] = 9;
            iArr[d.SDK_ASSET_HEADER_LINK_BANK_CONNECTED.ordinal()] = 10;
            iArr[d.SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_LAST_ATTEMPT.ordinal()] = 11;
            iArr[d.SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_NO_ATTEMPTS.ordinal()] = 12;
            iArr[d.SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_TWO_ATTEMPTS.ordinal()] = 13;
            iArr[d.SDK_ASSET_HEADER_ROUTING_NUMBER_CONFIRMED.ordinal()] = 14;
            iArr[d.SDK_ASSET_HEADER_ROUTING_NUMBER_HELP.ordinal()] = 15;
            iArr[d.SDK_ASSET_HEADER_ROUTING_NUMBER_SEARCH.ordinal()] = 16;
            iArr[d.SDK_ASSET_HEADER_SECOND_DEPOSIT.ordinal()] = 17;
            iArr[d.SDK_ASSET_ICON_ACTIVITY.ordinal()] = 18;
            iArr[d.SDK_ASSET_ICON_ADD.ordinal()] = 19;
            iArr[d.SDK_ASSET_ICON_ADD_CIRCLE.ordinal()] = 20;
            iArr[d.SDK_ASSET_ICON_ALERT_BELL.ordinal()] = 21;
            iArr[d.SDK_ASSET_ICON_ALERT_ERROR.ordinal()] = 22;
            iArr[d.SDK_ASSET_ICON_APPEARANCE_HIDE.ordinal()] = 23;
            iArr[d.SDK_ASSET_ICON_APPEARANCE_SHOW.ordinal()] = 24;
            iArr[d.SDK_ASSET_ICON_ARROW_LEFT.ordinal()] = 25;
            iArr[d.SDK_ASSET_ICON_ARROW_RIGHT.ordinal()] = 26;
            iArr[d.SDK_ASSET_ICON_ATTACHMENT.ordinal()] = 27;
            iArr[d.SDK_ASSET_ICON_BAR_GRAPH.ordinal()] = 28;
            iArr[d.SDK_ASSET_ICON_BOOK.ordinal()] = 29;
            iArr[d.SDK_ASSET_ICON_BOOKMARK.ordinal()] = 30;
            iArr[d.SDK_ASSET_ICON_BOOK_OPEN.ordinal()] = 31;
            iArr[d.SDK_ASSET_ICON_BRIEFCASE.ordinal()] = 32;
            iArr[d.SDK_ASSET_ICON_BUILD.ordinal()] = 33;
            iArr[d.SDK_ASSET_ICON_BUILDINGS.ordinal()] = 34;
            iArr[d.SDK_ASSET_ICON_CALENDAR.ordinal()] = 35;
            iArr[d.SDK_ASSET_ICON_CATEGORIES.ordinal()] = 36;
            iArr[d.SDK_ASSET_ICON_CHANGELOG.ordinal()] = 37;
            iArr[d.SDK_ASSET_ICON_CHECKMARK.ordinal()] = 38;
            iArr[d.SDK_ASSET_ICON_CHEVRON_DOWN_S1.ordinal()] = 39;
            iArr[d.SDK_ASSET_ICON_CHEVRON_DOWN_S2.ordinal()] = 40;
            iArr[d.SDK_ASSET_ICON_CHEVRON_LEFT_S1.ordinal()] = 41;
            iArr[d.SDK_ASSET_ICON_CHEVRON_LEFT_S2.ordinal()] = 42;
            iArr[d.SDK_ASSET_ICON_CHEVRON_RIGHT_S1.ordinal()] = 43;
            iArr[d.SDK_ASSET_ICON_CHEVRON_RIGHT_S2.ordinal()] = 44;
            iArr[d.SDK_ASSET_ICON_CHEVRON_UP_S1.ordinal()] = 45;
            iArr[d.SDK_ASSET_ICON_CHEVRON_UP_S2.ordinal()] = 46;
            iArr[d.SDK_ASSET_ICON_CLOSE_S1.ordinal()] = 47;
            iArr[d.SDK_ASSET_ICON_CLOSE_S2.ordinal()] = 48;
            iArr[d.SDK_ASSET_ICON_CONFIGURE.ordinal()] = 49;
            iArr[d.SDK_ASSET_ICON_COPY.ordinal()] = 50;
            iArr[d.SDK_ASSET_ICON_DATABASE.ordinal()] = 51;
            iArr[d.SDK_ASSET_ICON_DOCS.ordinal()] = 52;
            iArr[d.SDK_ASSET_ICON_DOCUMENT.ordinal()] = 53;
            iArr[d.SDK_ASSET_ICON_DOWNLOAD.ordinal()] = 54;
            iArr[d.SDK_ASSET_ICON_EDIT.ordinal()] = 55;
            iArr[d.SDK_ASSET_ICON_FOLDER.ordinal()] = 56;
            iArr[d.SDK_ASSET_ICON_GEAR.ordinal()] = 57;
            iArr[d.SDK_ASSET_ICON_GLOBE.ordinal()] = 58;
            iArr[d.SDK_ASSET_ICON_GUIDE.ordinal()] = 59;
            iArr[d.SDK_ASSET_ICON_HAND.ordinal()] = 60;
            iArr[d.SDK_ASSET_ICON_HELP.ordinal()] = 61;
            iArr[d.SDK_ASSET_ICON_HOME.ordinal()] = 62;
            iArr[d.SDK_ASSET_ICON_IDENTITY.ordinal()] = 63;
            iArr[d.SDK_ASSET_ICON_INBOX.ordinal()] = 64;
            iArr[d.SDK_ASSET_ICON_INFORMATION.ordinal()] = 65;
            iArr[d.SDK_ASSET_ICON_INSTITUTION.ordinal()] = 66;
            iArr[d.SDK_ASSET_ICON_INTEGRATIONS.ordinal()] = 67;
            iArr[d.SDK_ASSET_ICON_ITEMS.ordinal()] = 68;
            iArr[d.SDK_ASSET_ICON_ITEM_MANAGEMENT.ordinal()] = 69;
            iArr[d.SDK_ASSET_ICON_KEY.ordinal()] = 70;
            iArr[d.SDK_ASSET_ICON_LEARN.ordinal()] = 71;
            iArr[d.SDK_ASSET_ICON_LIBRARIES.ordinal()] = 72;
            iArr[d.SDK_ASSET_ICON_LIGHTBULB.ordinal()] = 73;
            iArr[d.SDK_ASSET_ICON_LINE_GRAPH.ordinal()] = 74;
            iArr[d.SDK_ASSET_ICON_LINK.ordinal()] = 75;
            iArr[d.SDK_ASSET_ICON_LIST.ordinal()] = 76;
            iArr[d.SDK_ASSET_ICON_LOCK.ordinal()] = 77;
            iArr[d.SDK_ASSET_ICON_LOGIN.ordinal()] = 78;
            iArr[d.SDK_ASSET_ICON_LOGOUT.ordinal()] = 79;
            iArr[d.SDK_ASSET_ICON_MAIL.ordinal()] = 80;
            iArr[d.SDK_ASSET_ICON_MENU_S1.ordinal()] = 81;
            iArr[d.SDK_ASSET_ICON_MENU_S2.ordinal()] = 82;
            iArr[d.SDK_ASSET_ICON_MESSAGE.ordinal()] = 83;
            iArr[d.SDK_ASSET_ICON_MOBILE.ordinal()] = 84;
            iArr[d.SDK_ASSET_ICON_NOTEBOOK.ordinal()] = 85;
            iArr[d.SDK_ASSET_ICON_OVERVIEW.ordinal()] = 86;
            iArr[d.SDK_ASSET_ICON_PHONE.ordinal()] = 87;
            iArr[d.SDK_ASSET_ICON_PIE_CHART.ordinal()] = 88;
            iArr[d.SDK_ASSET_ICON_PLATFORM.ordinal()] = 89;
            iArr[d.SDK_ASSET_ICON_PRODUCTS.ordinal()] = 90;
            iArr[d.SDK_ASSET_ICON_PRODUCT_AUTH.ordinal()] = 91;
            iArr[d.SDK_ASSET_ICON_PRODUCT_TRANSACTIONS.ordinal()] = 92;
            iArr[d.SDK_ASSET_ICON_REFRESH.ordinal()] = 93;
            iArr[d.SDK_ASSET_ICON_REMOVE.ordinal()] = 94;
            iArr[d.SDK_ASSET_ICON_RESET.ordinal()] = 95;
            iArr[d.SDK_ASSET_ICON_ROCKET.ordinal()] = 96;
            iArr[d.SDK_ASSET_ICON_ROTATE.ordinal()] = 97;
            iArr[d.SDK_ASSET_ICON_SAFE.ordinal()] = 98;
            iArr[d.SDK_ASSET_ICON_SANDBOX.ordinal()] = 99;
            iArr[d.SDK_ASSET_ICON_SEARCH.ordinal()] = 100;
            iArr[d.SDK_ASSET_ICON_SHIELD.ordinal()] = 101;
            iArr[d.SDK_ASSET_ICON_SIDEBAR_HIDE.ordinal()] = 102;
            iArr[d.SDK_ASSET_ICON_SIDEBAR_SHOW.ordinal()] = 103;
            iArr[d.SDK_ASSET_ICON_SWITCH.ordinal()] = 104;
            iArr[d.SDK_ASSET_ICON_TAG.ordinal()] = 105;
            iArr[d.SDK_ASSET_ICON_TERMINAL.ordinal()] = 106;
            iArr[d.SDK_ASSET_ICON_TRANSFER.ordinal()] = 107;
            iArr[d.SDK_ASSET_ICON_TRASH.ordinal()] = 108;
            iArr[d.SDK_ASSET_ICON_TWEET.ordinal()] = 109;
            iArr[d.SDK_ASSET_ICON_USER.ordinal()] = 110;
            iArr[d.SDK_ASSET_ICON_USERS.ordinal()] = 111;
            iArr[d.SDK_ASSET_ICON_VIDEO.ordinal()] = 112;
            iArr[d.SDK_ASSET_ICON_WALLET.ordinal()] = 113;
            iArr[d.SDK_ASSET_ICON_WEBHOOKS.ordinal()] = 114;
            iArr[d.SDK_ASSET_HEADER_SMS_TERMS.ordinal()] = 115;
            iArr[d.SDK_ASSET_ICON_LIGHTNING.ordinal()] = 116;
            iArr[d.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH.ordinal()] = 117;
            iArr[d.SDK_ASSET_ILLUSTRATION_DEPOSIT.ordinal()] = 118;
            iArr[d.SDK_ASSET_ILLUSTRATION_CALENDAR.ordinal()] = 119;
            iArr[d.SDK_ASSET_ILLUSTRATION_SIGNATURE.ordinal()] = 120;
            iArr[d.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY.ordinal()] = 121;
            iArr[d.SDK_ASSET_PLAID_LOGO_BLACK_BG.ordinal()] = 122;
            iArr[d.SDK_ASSET_ILLUSTRATION_BRIEFCASE.ordinal()] = 123;
            iArr[d.SDK_ASSET_PLAID_LOGO_CIRCLE.ordinal()] = 124;
            iArr[d.SDK_ASSET_ILLUSTRATION_FORM.ordinal()] = 125;
            iArr[d.SDK_ASSET_ILLUSTRATION_IN_CONTROL.ordinal()] = 126;
            iArr[d.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA.ordinal()] = 127;
            iArr[d.SDK_ASSET_ILLUSTRATION_DEV_LOGS.ordinal()] = 128;
            iArr[d.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION.ordinal()] = 129;
            iArr[d.SDK_ASSET_ILLUSTRATION_LINK_BANK.ordinal()] = 130;
            iArr[d.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE.ordinal()] = 131;
            iArr[d.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA.ordinal()] = 132;
            iArr[d.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01.ordinal()] = 133;
            iArr[d.SDK_ASSET_ICON_ALERT_ERROR_RED.ordinal()] = 134;
            iArr[d.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION.ordinal()] = 135;
            iArr[d.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION.ordinal()] = 136;
            iArr[d.SDK_ASSET_ICON_ALERT_ERROR_BLACK.ordinal()] = 137;
            iArr[d.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO.ordinal()] = 138;
            f18164a = iArr;
        }
    }

    public static final int a(d dVar) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        switch (a.f18164a[dVar.ordinal()]) {
            case 1:
                return R.drawable.pl_illustration_spot_account_admin;
            case 2:
                return R.drawable.pl_illustration_spot_account_number_confirmed;
            case 3:
                return R.drawable.pl_illustration_scene_check_account_number;
            case 4:
                return R.drawable.pl_illustration_spot_account_number_search;
            case 5:
                return R.drawable.pl_illustration_scene_consent;
            case 6:
                return R.drawable.pl_illustration_scene_error;
            case 7:
                return R.drawable.pl_illustration_scene_success;
            case 8:
                return R.drawable.pl_illustration_spot_first_deposit_01;
            case 9:
                return R.drawable.pl_illustration_spot_link_bank_01;
            case 10:
                return R.drawable.pl_illustration_spot_link_bank_02;
            case 11:
                return R.drawable.pl_illustration_scene_error_attempt_2;
            case 12:
                return R.drawable.pl_illustration_scene_error_attempt_3;
            case 13:
                return R.drawable.pl_illustration_scene_error_attempt_1;
            case 14:
                return R.drawable.pl_illustration_spot_routing_number_confirmed;
            case 15:
                return R.drawable.pl_illustration_scene_check_routing_number;
            case 16:
                return R.drawable.pl_illustration_spot_routing_number_search;
            case 17:
                return R.drawable.pl_illustration_spot_first_deposit_02;
            case 18:
                return R.drawable.pl_icon_activity;
            case 19:
                return R.drawable.pl_icon_add;
            case 20:
                return R.drawable.pl_icon_add_circle;
            case 21:
                return R.drawable.pl_icon_alert_bell;
            case 22:
                return R.drawable.pl_icon_alert_error;
            case 23:
                return R.drawable.pl_icon_appearance_hide;
            case 24:
                return R.drawable.pl_icon_appearance_show;
            case 25:
                return R.drawable.pl_icon_arrow_left;
            case 26:
                return R.drawable.pl_icon_arrow_right;
            case 27:
                return R.drawable.pl_icon_attachment;
            case 28:
                return R.drawable.pl_icon_bar_graph;
            case 29:
                return R.drawable.pl_icon_book;
            case 30:
                return R.drawable.pl_icon_bookmark;
            case 31:
                return R.drawable.pl_icon_book_open;
            case 32:
                return R.drawable.pl_icon_briefcase;
            case 33:
                return R.drawable.pl_icon_build;
            case 34:
                return R.drawable.pl_icon_buildings;
            case 35:
                return R.drawable.pl_icon_calendar;
            case 36:
                return R.drawable.pl_icon_categories;
            case 37:
                return R.drawable.pl_icon_changelog;
            case 38:
                return R.drawable.pl_icon_checkmark;
            case 39:
                return R.drawable.pl_icon_chevron_s1_down;
            case 40:
                return R.drawable.pl_icon_chevron_s2_down;
            case 41:
                return R.drawable.pl_icon_chevron_s1_left;
            case 42:
                return R.drawable.pl_icon_chevron_s2_left;
            case 43:
                return R.drawable.pl_icon_chevron_s1_right;
            case 44:
                return R.drawable.pl_icon_chevron_s2_right;
            case 45:
                return R.drawable.pl_icon_chevron_s1_up;
            case 46:
                return R.drawable.pl_icon_chevron_s2_up;
            case 47:
                return R.drawable.pl_icon_close_s1;
            case 48:
                return R.drawable.pl_icon_close_s2;
            case 49:
                return R.drawable.pl_icon_configure;
            case 50:
                return R.drawable.pl_icon_copy;
            case 51:
                return R.drawable.pl_icon_database;
            case 52:
                return R.drawable.pl_icon_docs;
            case 53:
                return R.drawable.pl_icon_document;
            case 54:
                return R.drawable.pl_icon_download;
            case 55:
                return R.drawable.pl_icon_edit;
            case 56:
                return R.drawable.pl_icon_folder;
            case 57:
                return R.drawable.pl_icon_gear;
            case 58:
                return R.drawable.pl_icon_globe;
            case 59:
                return R.drawable.pl_icon_guide;
            case 60:
                return R.drawable.pl_icon_hand;
            case 61:
                return R.drawable.pl_icon_help;
            case 62:
                return R.drawable.pl_icon_home;
            case 63:
                return R.drawable.pl_icon_identity;
            case 64:
                return R.drawable.pl_icon_inbox;
            case 65:
                return R.drawable.pl_icon_information;
            case 66:
                return R.drawable.pl_icon_institution;
            case 67:
                return R.drawable.pl_icon_integrations;
            case 68:
                return R.drawable.pl_icon_items;
            case 69:
                return R.drawable.pl_icon_item_management;
            case 70:
                return R.drawable.pl_icon_key;
            case 71:
                return R.drawable.pl_icon_learn;
            case 72:
                return R.drawable.pl_icon_libraries;
            case 73:
                return R.drawable.pl_icon_lightbulb;
            case 74:
                return R.drawable.pl_icon_line_graph;
            case 75:
                return R.drawable.pl_icon_link;
            case 76:
                return R.drawable.pl_icon_list;
            case 77:
                return R.drawable.pl_icon_lock;
            case 78:
                return R.drawable.pl_icon_login;
            case 79:
                return R.drawable.pl_icon_logout;
            case 80:
                return R.drawable.pl_icon_mail;
            case 81:
                return R.drawable.pl_icon_menu_s1;
            case 82:
                return R.drawable.pl_icon_menu_s2;
            case 83:
                return R.drawable.pl_icon_message;
            case 84:
                return R.drawable.pl_icon_mobile;
            case 85:
                return R.drawable.pl_icon_notebook;
            case 86:
                return R.drawable.pl_icon_overview;
            case 87:
                return R.drawable.pl_icon_phone;
            case 88:
                return R.drawable.pl_icon_pie_chart;
            case 89:
                return R.drawable.pl_icon_platform;
            case 90:
                return R.drawable.pl_icon_products;
            case 91:
                return R.drawable.pl_icon_product_auth;
            case 92:
                return R.drawable.pl_icon_product_transactions;
            case 93:
                return R.drawable.pl_icon_refresh;
            case 94:
                return R.drawable.pl_icon_remove;
            case 95:
                return R.drawable.pl_icon_reset;
            case 96:
                return R.drawable.pl_icon_rocket;
            case 97:
                return R.drawable.pl_icon_rotate;
            case 98:
                return R.drawable.pl_icon_safe;
            case 99:
                return R.drawable.pl_icon_sandbox;
            case 100:
                return R.drawable.pl_icon_search;
            case 101:
                return R.drawable.pl_icon_shield;
            case 102:
                return R.drawable.pl_icon_sidebar_hide;
            case 103:
                return R.drawable.pl_icon_sidebar_show;
            case 104:
                return R.drawable.pl_icon_switch;
            case 105:
                return R.drawable.pl_icon_tag;
            case 106:
                return R.drawable.pl_icon_terminal;
            case 107:
                return R.drawable.pl_icon_transfer;
            case 108:
                return R.drawable.pl_icon_trash;
            case 109:
                return R.drawable.pl_icon_tweet;
            case 110:
                return R.drawable.pl_icon_user;
            case 111:
                return R.drawable.pl_icon_users;
            case 112:
                return R.drawable.pl_icon_video;
            case 113:
                return R.drawable.pl_icon_wallet;
            case 114:
                return R.drawable.pl_icon_webhooks;
            case 115:
                return R.drawable.pl_illustration_sms_terms;
            case 116:
                return R.drawable.pl_icon_lightning;
            case 117:
                return R.drawable.pl_illustration_deposit_switch;
            case 118:
                return R.drawable.pl_illustration_deposit;
            case 119:
                return R.drawable.pl_illustration_calendar;
            case 120:
                return R.drawable.pl_illustration_signature;
            case 121:
                return R.drawable.pl_illustration_deposit_switch;
            case 122:
                return R.drawable.plaid_logo_horizontal;
            case 123:
                return R.drawable.pl_icon_briefcase;
            case 124:
                return R.drawable.plaid_logo_round;
            case 125:
                return R.drawable.pl_illustration_forms;
            case 126:
                return R.drawable.pl_illustration_in_control;
            case 127:
                return R.drawable.pl_illustration_spot_dev_faulty_data;
            case 128:
                return R.drawable.pl_illustration_spot_dev_logs;
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                return R.drawable.pl_illustration_institution_error;
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                return R.drawable.pl_illustration_spot_link_bank_01;
            case SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE:
                return R.drawable.pl_illustration_institution_circle;
            case 132:
                return R.drawable.pl_illustration_share_your_data;
            case 133:
                return R.drawable.pl_illustration_spot_px_feature_01;
            case 134:
                return R.drawable.pl_icon_alert_error_red;
            case 135:
                return R.drawable.pl_illustration_connectivity_down;
            case 136:
                return R.drawable.pl_illustration_connectivity_down;
            case 137:
                return R.drawable.pl_icon_alert_error;
            case 138:
                return R.drawable.plaid_logo_horizontal;
            default:
                wa.a.c(wa.f19678a, kotlin.jvm.internal.s.p("Missing SDKAsset: ", dVar), false, 2);
                return 17170445;
        }
    }

    public static final void a(ImageView imageView, Common$RenderedAsset common$RenderedAsset) {
        ByteString bytes;
        byte[] byteArray;
        d asset;
        kotlin.jvm.internal.s.g(imageView, "<this>");
        if (common$RenderedAsset == null) {
            return;
        }
        if (common$RenderedAsset.hasUrl()) {
            String url = common$RenderedAsset.getUrl();
            Context context = imageView.getContext();
            kotlin.jvm.internal.s.f(context, "context");
            r5.d a11 = r5.a.a(context);
            Context context2 = imageView.getContext();
            kotlin.jvm.internal.s.f(context2, "context");
            a11.a(new g.a(context2).b(url).i(imageView).a());
        }
        if (common$RenderedAsset.hasAsset() && (asset = common$RenderedAsset.getAsset()) != null) {
            imageView.setImageResource(a(asset));
        }
        if (!common$RenderedAsset.hasBytes() || common$RenderedAsset.getBytes().size() == 0 || (bytes = common$RenderedAsset.getBytes()) == null || (byteArray = bytes.toByteArray()) == null) {
            return;
        }
        imageView.setImageDrawable(new BitmapDrawable(imageView.getResources(), BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length)));
    }

    public static final void a(ImageView imageView, Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        Common$RenderedAsset lightAppearance;
        vz.b0 b0Var;
        kotlin.jvm.internal.s.g(imageView, "<this>");
        if (common$RenderedAssetAppearance == null) {
            b0Var = null;
        } else {
            boolean z11 = false;
            imageView.setVisibility(0);
            if (common$RenderedAssetAppearance.hasDarkAppearance()) {
                Resources resources = imageView.getResources();
                kotlin.jvm.internal.s.f(resources, "this.resources");
                kotlin.jvm.internal.s.g(resources, "<this>");
                int i11 = resources.getConfiguration().uiMode & 48;
                if (i11 != 0 && i11 != 16 && i11 == 32) {
                    z11 = true;
                }
                if (z11) {
                    lightAppearance = common$RenderedAssetAppearance.getDarkAppearance();
                    a(imageView, lightAppearance);
                    b0Var = vz.b0.f54756a;
                }
            }
            lightAppearance = common$RenderedAssetAppearance.getLightAppearance();
            a(imageView, lightAppearance);
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            imageView.setVisibility(8);
        }
    }
}