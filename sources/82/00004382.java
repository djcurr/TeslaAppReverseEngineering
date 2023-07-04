package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum d implements Internal.EnumLite {
    SDK_ASSET_UNKNOWN(0),
    SDK_ASSET_HEADER_FINAL_SUCCESS(1),
    SDK_ASSET_HEADER_FINAL_ERROR(2),
    SDK_ASSET_HEADER_CONNECT_WITH_PLAID(3),
    SDK_ASSET_HEADER_LINK_BANK(4),
    SDK_ASSET_HEADER_LINK_BANK_CONNECTED(5),
    SDK_ASSET_HEADER_ROUTING_NUMBER_CONFIRMED(6),
    SDK_ASSET_HEADER_ROUTING_NUMBER_SEARCH(7),
    SDK_ASSET_HEADER_ACCOUNT_NUMBER_CONFIRMED(8),
    SDK_ASSET_HEADER_ACCOUNT_NUMBER_SEARCH(9),
    SDK_ASSET_HEADER_ACCOUNT_ADMIN(10),
    SDK_ASSET_HEADER_FIRST_DEPOSIT(11),
    SDK_ASSET_HEADER_SECOND_DEPOSIT(12),
    SDK_ASSET_HEADER_PERSONAL_BUSINESS(13),
    SDK_ASSET_HEADER_CHECKINGS_SAVINGS(14),
    SDK_ASSET_ICON_USER(15),
    SDK_ASSET_ICON_CHECKMARK(16),
    SDK_ASSET_ICON_WEBHOOKS(17),
    SDK_ASSET_ICON_WALLET(18),
    SDK_ASSET_ICON_VIDEO(19),
    SDK_ASSET_ICON_USERS(20),
    SDK_ASSET_ICON_TWEET(21),
    SDK_ASSET_ICON_TRASH(22),
    SDK_ASSET_ICON_TRANSFER(23),
    SDK_ASSET_ICON_TERMINAL(24),
    SDK_ASSET_ICON_TAG(25),
    SDK_ASSET_ICON_SWITCH(26),
    SDK_ASSET_ICON_SIDEBAR_SHOW(27),
    SDK_ASSET_ICON_SIDEBAR_HIDE(28),
    SDK_ASSET_ICON_SHIELD(29),
    SDK_ASSET_ICON_SEARCH(30),
    SDK_ASSET_ICON_SANDBOX(31),
    SDK_ASSET_ICON_SAFE(32),
    SDK_ASSET_ICON_ROTATE(33),
    SDK_ASSET_ICON_ROCKET(34),
    SDK_ASSET_ICON_RESET(35),
    SDK_ASSET_ICON_REMOVE(36),
    SDK_ASSET_ICON_REFRESH(37),
    SDK_ASSET_ICON_PRODUCTS(38),
    SDK_ASSET_ICON_PRODUCT_TRANSACTIONS(39),
    SDK_ASSET_ICON_PRODUCT_AUTH(40),
    SDK_ASSET_ICON_PLATFORM(41),
    SDK_ASSET_ICON_PIE_CHART(42),
    SDK_ASSET_ICON_PHONE(43),
    SDK_ASSET_ICON_OVERVIEW(44),
    SDK_ASSET_ICON_NOTEBOOK(45),
    SDK_ASSET_ICON_MOBILE(46),
    SDK_ASSET_ICON_MESSAGE(47),
    SDK_ASSET_ICON_MENU_S2(48),
    SDK_ASSET_ICON_MENU_S1(49),
    SDK_ASSET_ICON_MAIL(50),
    SDK_ASSET_ICON_LOGOUT(51),
    SDK_ASSET_ICON_LOGIN(52),
    SDK_ASSET_ICON_LOCK(53),
    SDK_ASSET_ICON_LIST(54),
    SDK_ASSET_ICON_LINK(55),
    SDK_ASSET_ICON_LINE_GRAPH(56),
    SDK_ASSET_ICON_LIGHTBULB(57),
    SDK_ASSET_ICON_LIBRARIES(58),
    SDK_ASSET_ICON_LEARN(59),
    SDK_ASSET_ICON_KEY(60),
    SDK_ASSET_ICON_ITEMS(61),
    SDK_ASSET_ICON_ITEM_MANAGEMENT(62),
    SDK_ASSET_ICON_INTEGRATIONS(63),
    SDK_ASSET_ICON_INSTITUTION(64),
    SDK_ASSET_ICON_INFORMATION(65),
    SDK_ASSET_ICON_INBOX(66),
    SDK_ASSET_ICON_IDENTITY(67),
    SDK_ASSET_ICON_HOME(68),
    SDK_ASSET_ICON_HELP(69),
    SDK_ASSET_ICON_HAND(70),
    SDK_ASSET_ICON_GUIDE(71),
    SDK_ASSET_ICON_GLOBE(72),
    SDK_ASSET_ICON_GEAR(73),
    SDK_ASSET_ICON_FOLDER(74),
    SDK_ASSET_ICON_EDIT(75),
    SDK_ASSET_ICON_DOWNLOAD(76),
    SDK_ASSET_ICON_DOCUMENT(77),
    SDK_ASSET_ICON_DOCS(78),
    SDK_ASSET_ICON_DATABASE(79),
    SDK_ASSET_ICON_COPY(80),
    SDK_ASSET_ICON_CONFIGURE(81),
    SDK_ASSET_ICON_CLOSE_S2(82),
    SDK_ASSET_ICON_CLOSE_S1(83),
    SDK_ASSET_ICON_CHEVRON_UP_S1(84),
    SDK_ASSET_ICON_CHEVRON_UP_S2(85),
    SDK_ASSET_ICON_CHEVRON_RIGHT_S2(86),
    SDK_ASSET_ICON_CHEVRON_LEFT_S2(87),
    SDK_ASSET_ICON_CHEVRON_RIGHT_S1(88),
    SDK_ASSET_ICON_CHEVRON_LEFT_S1(89),
    SDK_ASSET_ICON_CHEVRON_DOWN_S1(90),
    SDK_ASSET_ICON_CHEVRON_DOWN_S2(91),
    SDK_ASSET_ICON_CHANGELOG(92),
    SDK_ASSET_ICON_CATEGORIES(93),
    SDK_ASSET_ICON_CALENDAR(94),
    SDK_ASSET_ICON_BUILDINGS(95),
    SDK_ASSET_ICON_BUILD(96),
    SDK_ASSET_ICON_BRIEFCASE(97),
    SDK_ASSET_ICON_BOOKMARK(98),
    SDK_ASSET_ICON_BOOK_OPEN(99),
    SDK_ASSET_ICON_BOOK(100),
    SDK_ASSET_ICON_BAR_GRAPH(101),
    SDK_ASSET_ICON_ATTACHMENT(102),
    SDK_ASSET_ICON_ARROW_RIGHT(103),
    SDK_ASSET_ICON_ARROW_LEFT(104),
    SDK_ASSET_ICON_APPEARANCE_SHOW(105),
    SDK_ASSET_ICON_APPEARANCE_HIDE(106),
    SDK_ASSET_ICON_ALERT_ERROR(107),
    SDK_ASSET_ICON_ALERT_BELL(108),
    SDK_ASSET_ICON_ADD_CIRCLE(109),
    SDK_ASSET_ICON_ADD(110),
    SDK_ASSET_ICON_ACTIVITY(111),
    SDK_ASSET_HEADER_ROUTING_NUMBER_HELP(112),
    SDK_ASSET_HEADER_ACCOUNT_NUMBER_HELP(113),
    SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_TWO_ATTEMPTS(114),
    SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_LAST_ATTEMPT(115),
    SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_NO_ATTEMPTS(116),
    SDK_ASSET_HEADER_OAUTH_LIFTOFF(117),
    SDK_ASSET_HEADER_OAUTH_LANDING(118),
    SDK_ASSET_HEADER_SMS_TERMS(119),
    SDK_ASSET_ICON_LIGHTNING(120),
    SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH(121),
    SDK_ASSET_ILLUSTRATION_DEPOSIT(122),
    SDK_ASSET_ILLUSTRATION_CALENDAR(123),
    SDK_ASSET_ILLUSTRATION_SIGNATURE(124),
    SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY(125),
    SDK_ASSET_PLAID_LOGO_BLACK_BG(126),
    SDK_ASSET_ILLUSTRATION_BRIEFCASE(127),
    SDK_ASSET_PLAID_LOGO_CIRCLE(128),
    SDK_ASSET_ILLUSTRATION_FORM(SDK_ASSET_ILLUSTRATION_FORM_VALUE),
    SDK_ASSET_ILLUSTRATION_CONSUMER(SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE),
    SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND(SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE),
    SDK_ASSET_ILLUSTRATION_IN_CONTROL(132),
    SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA(133),
    SDK_ASSET_ILLUSTRATION_DEV_LOGS(134),
    SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION(135),
    SDK_ASSET_ILLUSTRATION_LINK_BANK(136),
    SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE(137),
    SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA(138),
    SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01(139),
    SDK_ASSET_ICON_ALERT_ERROR_RED(140),
    SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION(141),
    SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION(142),
    SDK_ASSET_ICON_ALERT_ERROR_BLACK(143),
    SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BANK(144),
    SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT(145),
    SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON(146),
    SDK_ASSET_HEADER_UNDER_CONSTRUCTION(147),
    SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH(148),
    SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG(149),
    SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO(150),
    SDK_ASSET_HEADER_ABOUT_PLAID_SECURITY(151),
    SDK_ASSET_ICON_CHECKMARK_BLUE(152),
    SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION(153),
    SDK_ASSET_ILLUSTRATION_UPLOAD(154),
    SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS(155),
    SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED(156),
    SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION(157),
    SDK_ASSET_ILLUSTRATION_WALLET(158),
    SDK_ASSET_ILLUSTRATION_INCOME(159),
    SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION(160),
    UNRECOGNIZED(-1);
    
    public static final int SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE = 141;
    public static final int SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE = 142;
    public static final int SDK_ASSET_HEADER_ABOUT_PLAID_SECURITY_VALUE = 151;
    public static final int SDK_ASSET_HEADER_ACCOUNT_ADMIN_VALUE = 10;
    public static final int SDK_ASSET_HEADER_ACCOUNT_NUMBER_CONFIRMED_VALUE = 8;
    public static final int SDK_ASSET_HEADER_ACCOUNT_NUMBER_HELP_VALUE = 113;
    public static final int SDK_ASSET_HEADER_ACCOUNT_NUMBER_SEARCH_VALUE = 9;
    public static final int SDK_ASSET_HEADER_CHECKINGS_SAVINGS_VALUE = 14;
    public static final int SDK_ASSET_HEADER_CONNECT_WITH_PLAID_VALUE = 3;
    public static final int SDK_ASSET_HEADER_FINAL_ERROR_VALUE = 2;
    public static final int SDK_ASSET_HEADER_FINAL_SUCCESS_VALUE = 1;
    public static final int SDK_ASSET_HEADER_FIRST_DEPOSIT_VALUE = 11;
    public static final int SDK_ASSET_HEADER_LINK_BANK_CONNECTED_VALUE = 5;
    public static final int SDK_ASSET_HEADER_LINK_BANK_VALUE = 4;
    public static final int SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_LAST_ATTEMPT_VALUE = 115;
    public static final int SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_NO_ATTEMPTS_VALUE = 116;
    public static final int SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_TWO_ATTEMPTS_VALUE = 114;
    public static final int SDK_ASSET_HEADER_OAUTH_LANDING_VALUE = 118;
    public static final int SDK_ASSET_HEADER_OAUTH_LIFTOFF_VALUE = 117;
    public static final int SDK_ASSET_HEADER_PERSONAL_BUSINESS_VALUE = 13;
    public static final int SDK_ASSET_HEADER_ROUTING_NUMBER_CONFIRMED_VALUE = 6;
    public static final int SDK_ASSET_HEADER_ROUTING_NUMBER_HELP_VALUE = 112;
    public static final int SDK_ASSET_HEADER_ROUTING_NUMBER_SEARCH_VALUE = 7;
    public static final int SDK_ASSET_HEADER_SECOND_DEPOSIT_VALUE = 12;
    public static final int SDK_ASSET_HEADER_SMS_TERMS_VALUE = 119;
    public static final int SDK_ASSET_HEADER_UNDER_CONSTRUCTION_VALUE = 147;
    public static final int SDK_ASSET_ICON_ACTIVITY_VALUE = 111;
    public static final int SDK_ASSET_ICON_ADD_CIRCLE_VALUE = 109;
    public static final int SDK_ASSET_ICON_ADD_VALUE = 110;
    public static final int SDK_ASSET_ICON_ALERT_BELL_VALUE = 108;
    public static final int SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE = 143;
    public static final int SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE = 140;
    public static final int SDK_ASSET_ICON_ALERT_ERROR_VALUE = 107;
    public static final int SDK_ASSET_ICON_APPEARANCE_HIDE_VALUE = 106;
    public static final int SDK_ASSET_ICON_APPEARANCE_SHOW_VALUE = 105;
    public static final int SDK_ASSET_ICON_ARROW_LEFT_VALUE = 104;
    public static final int SDK_ASSET_ICON_ARROW_RIGHT_VALUE = 103;
    public static final int SDK_ASSET_ICON_ATTACHMENT_VALUE = 102;
    public static final int SDK_ASSET_ICON_BAR_GRAPH_VALUE = 101;
    public static final int SDK_ASSET_ICON_BOOKMARK_VALUE = 98;
    public static final int SDK_ASSET_ICON_BOOK_OPEN_VALUE = 99;
    public static final int SDK_ASSET_ICON_BOOK_VALUE = 100;
    public static final int SDK_ASSET_ICON_BRIEFCASE_VALUE = 97;
    public static final int SDK_ASSET_ICON_BUILDINGS_VALUE = 95;
    public static final int SDK_ASSET_ICON_BUILD_VALUE = 96;
    public static final int SDK_ASSET_ICON_CALENDAR_VALUE = 94;
    public static final int SDK_ASSET_ICON_CATEGORIES_VALUE = 93;
    public static final int SDK_ASSET_ICON_CHANGELOG_VALUE = 92;
    public static final int SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE = 152;
    public static final int SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE = 148;
    public static final int SDK_ASSET_ICON_CHECKMARK_VALUE = 16;
    public static final int SDK_ASSET_ICON_CHEVRON_DOWN_S1_VALUE = 90;
    public static final int SDK_ASSET_ICON_CHEVRON_DOWN_S2_VALUE = 91;
    public static final int SDK_ASSET_ICON_CHEVRON_LEFT_S1_VALUE = 89;
    public static final int SDK_ASSET_ICON_CHEVRON_LEFT_S2_VALUE = 87;
    public static final int SDK_ASSET_ICON_CHEVRON_RIGHT_S1_VALUE = 88;
    public static final int SDK_ASSET_ICON_CHEVRON_RIGHT_S2_VALUE = 86;
    public static final int SDK_ASSET_ICON_CHEVRON_UP_S1_VALUE = 84;
    public static final int SDK_ASSET_ICON_CHEVRON_UP_S2_VALUE = 85;
    public static final int SDK_ASSET_ICON_CLOSE_S1_VALUE = 83;
    public static final int SDK_ASSET_ICON_CLOSE_S2_VALUE = 82;
    public static final int SDK_ASSET_ICON_CONFIGURE_VALUE = 81;
    public static final int SDK_ASSET_ICON_COPY_VALUE = 80;
    public static final int SDK_ASSET_ICON_DATABASE_VALUE = 79;
    public static final int SDK_ASSET_ICON_DOCS_VALUE = 78;
    public static final int SDK_ASSET_ICON_DOCUMENT_VALUE = 77;
    public static final int SDK_ASSET_ICON_DOWNLOAD_VALUE = 76;
    public static final int SDK_ASSET_ICON_EDIT_VALUE = 75;
    public static final int SDK_ASSET_ICON_FOLDER_VALUE = 74;
    public static final int SDK_ASSET_ICON_GEAR_VALUE = 73;
    public static final int SDK_ASSET_ICON_GLOBE_VALUE = 72;
    public static final int SDK_ASSET_ICON_GUIDE_VALUE = 71;
    public static final int SDK_ASSET_ICON_HAND_VALUE = 70;
    public static final int SDK_ASSET_ICON_HELP_VALUE = 69;
    public static final int SDK_ASSET_ICON_HOME_VALUE = 68;
    public static final int SDK_ASSET_ICON_IDENTITY_VALUE = 67;
    public static final int SDK_ASSET_ICON_INBOX_VALUE = 66;
    public static final int SDK_ASSET_ICON_INFORMATION_VALUE = 65;
    public static final int SDK_ASSET_ICON_INSTITUTION_VALUE = 64;
    public static final int SDK_ASSET_ICON_INTEGRATIONS_VALUE = 63;
    public static final int SDK_ASSET_ICON_ITEMS_VALUE = 61;
    public static final int SDK_ASSET_ICON_ITEM_MANAGEMENT_VALUE = 62;
    public static final int SDK_ASSET_ICON_KEY_VALUE = 60;
    public static final int SDK_ASSET_ICON_LEARN_VALUE = 59;
    public static final int SDK_ASSET_ICON_LIBRARIES_VALUE = 58;
    public static final int SDK_ASSET_ICON_LIGHTBULB_VALUE = 57;
    public static final int SDK_ASSET_ICON_LIGHTNING_VALUE = 120;
    public static final int SDK_ASSET_ICON_LINE_GRAPH_VALUE = 56;
    public static final int SDK_ASSET_ICON_LINK_VALUE = 55;
    public static final int SDK_ASSET_ICON_LIST_VALUE = 54;
    public static final int SDK_ASSET_ICON_LOCK_VALUE = 53;
    public static final int SDK_ASSET_ICON_LOGIN_VALUE = 52;
    public static final int SDK_ASSET_ICON_LOGOUT_VALUE = 51;
    public static final int SDK_ASSET_ICON_MAIL_VALUE = 50;
    public static final int SDK_ASSET_ICON_MENU_S1_VALUE = 49;
    public static final int SDK_ASSET_ICON_MENU_S2_VALUE = 48;
    public static final int SDK_ASSET_ICON_MESSAGE_VALUE = 47;
    public static final int SDK_ASSET_ICON_MOBILE_VALUE = 46;
    public static final int SDK_ASSET_ICON_NOTEBOOK_VALUE = 45;
    public static final int SDK_ASSET_ICON_OVERVIEW_VALUE = 44;
    public static final int SDK_ASSET_ICON_PHONE_VALUE = 43;
    public static final int SDK_ASSET_ICON_PIE_CHART_VALUE = 42;
    public static final int SDK_ASSET_ICON_PLATFORM_VALUE = 41;
    public static final int SDK_ASSET_ICON_PRODUCTS_VALUE = 38;
    public static final int SDK_ASSET_ICON_PRODUCT_AUTH_VALUE = 40;
    public static final int SDK_ASSET_ICON_PRODUCT_TRANSACTIONS_VALUE = 39;
    public static final int SDK_ASSET_ICON_REFRESH_VALUE = 37;
    public static final int SDK_ASSET_ICON_REMOVE_VALUE = 36;
    public static final int SDK_ASSET_ICON_RESET_VALUE = 35;
    public static final int SDK_ASSET_ICON_ROCKET_VALUE = 34;
    public static final int SDK_ASSET_ICON_ROTATE_VALUE = 33;
    public static final int SDK_ASSET_ICON_SAFE_VALUE = 32;
    public static final int SDK_ASSET_ICON_SANDBOX_VALUE = 31;
    public static final int SDK_ASSET_ICON_SEARCH_VALUE = 30;
    public static final int SDK_ASSET_ICON_SHIELD_VALUE = 29;
    public static final int SDK_ASSET_ICON_SIDEBAR_HIDE_VALUE = 28;
    public static final int SDK_ASSET_ICON_SIDEBAR_SHOW_VALUE = 27;
    public static final int SDK_ASSET_ICON_SWITCH_VALUE = 26;
    public static final int SDK_ASSET_ICON_TAG_VALUE = 25;
    public static final int SDK_ASSET_ICON_TERMINAL_VALUE = 24;
    public static final int SDK_ASSET_ICON_TRANSFER_VALUE = 23;
    public static final int SDK_ASSET_ICON_TRASH_VALUE = 22;
    public static final int SDK_ASSET_ICON_TWEET_VALUE = 21;
    public static final int SDK_ASSET_ICON_USERS_VALUE = 20;
    public static final int SDK_ASSET_ICON_USER_VALUE = 15;
    public static final int SDK_ASSET_ICON_VIDEO_VALUE = 19;
    public static final int SDK_ASSET_ICON_WALLET_VALUE = 18;
    public static final int SDK_ASSET_ICON_WEBHOOKS_VALUE = 17;
    public static final int SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE = 127;
    public static final int SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE = 123;
    public static final int SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE = 130;
    public static final int SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_VALUE = 125;
    public static final int SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE = 121;
    public static final int SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE = 122;
    public static final int SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE = 133;
    public static final int SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE = 134;
    public static final int SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE = 156;
    public static final int SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE = 135;
    public static final int SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE = 131;
    public static final int SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE = 157;
    public static final int SDK_ASSET_ILLUSTRATION_FORM_VALUE = 129;
    public static final int SDK_ASSET_ILLUSTRATION_INCOME_VALUE = 159;
    public static final int SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE = 137;
    public static final int SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE = 132;
    public static final int SDK_ASSET_ILLUSTRATION_LINK_BANK_VALUE = 136;
    public static final int SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE = 155;
    public static final int SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE = 145;
    public static final int SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BANK_VALUE = 144;
    public static final int SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE = 146;
    public static final int SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE = 149;
    public static final int SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE = 150;
    public static final int SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE = 160;
    public static final int SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE = 138;
    public static final int SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE = 124;
    public static final int SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE = 139;
    public static final int SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE = 153;
    public static final int SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE = 154;
    public static final int SDK_ASSET_ILLUSTRATION_WALLET_VALUE = 158;
    public static final int SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE = 126;
    public static final int SDK_ASSET_PLAID_LOGO_CIRCLE_VALUE = 128;
    public static final int SDK_ASSET_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<d> f18473b = new Internal.EnumLiteMap<d>() { // from class: com.plaid.internal.d.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public d findValueByNumber(int i11) {
            return d.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f18475a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f18476a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return d.forNumber(i11) != null;
        }
    }

    d(int i11) {
        this.f18475a = i11;
    }

    public static d forNumber(int i11) {
        switch (i11) {
            case 0:
                return SDK_ASSET_UNKNOWN;
            case 1:
                return SDK_ASSET_HEADER_FINAL_SUCCESS;
            case 2:
                return SDK_ASSET_HEADER_FINAL_ERROR;
            case 3:
                return SDK_ASSET_HEADER_CONNECT_WITH_PLAID;
            case 4:
                return SDK_ASSET_HEADER_LINK_BANK;
            case 5:
                return SDK_ASSET_HEADER_LINK_BANK_CONNECTED;
            case 6:
                return SDK_ASSET_HEADER_ROUTING_NUMBER_CONFIRMED;
            case 7:
                return SDK_ASSET_HEADER_ROUTING_NUMBER_SEARCH;
            case 8:
                return SDK_ASSET_HEADER_ACCOUNT_NUMBER_CONFIRMED;
            case 9:
                return SDK_ASSET_HEADER_ACCOUNT_NUMBER_SEARCH;
            case 10:
                return SDK_ASSET_HEADER_ACCOUNT_ADMIN;
            case 11:
                return SDK_ASSET_HEADER_FIRST_DEPOSIT;
            case 12:
                return SDK_ASSET_HEADER_SECOND_DEPOSIT;
            case 13:
                return SDK_ASSET_HEADER_PERSONAL_BUSINESS;
            case 14:
                return SDK_ASSET_HEADER_CHECKINGS_SAVINGS;
            case 15:
                return SDK_ASSET_ICON_USER;
            case 16:
                return SDK_ASSET_ICON_CHECKMARK;
            case 17:
                return SDK_ASSET_ICON_WEBHOOKS;
            case 18:
                return SDK_ASSET_ICON_WALLET;
            case 19:
                return SDK_ASSET_ICON_VIDEO;
            case 20:
                return SDK_ASSET_ICON_USERS;
            case 21:
                return SDK_ASSET_ICON_TWEET;
            case 22:
                return SDK_ASSET_ICON_TRASH;
            case 23:
                return SDK_ASSET_ICON_TRANSFER;
            case 24:
                return SDK_ASSET_ICON_TERMINAL;
            case 25:
                return SDK_ASSET_ICON_TAG;
            case 26:
                return SDK_ASSET_ICON_SWITCH;
            case 27:
                return SDK_ASSET_ICON_SIDEBAR_SHOW;
            case 28:
                return SDK_ASSET_ICON_SIDEBAR_HIDE;
            case 29:
                return SDK_ASSET_ICON_SHIELD;
            case 30:
                return SDK_ASSET_ICON_SEARCH;
            case 31:
                return SDK_ASSET_ICON_SANDBOX;
            case 32:
                return SDK_ASSET_ICON_SAFE;
            case 33:
                return SDK_ASSET_ICON_ROTATE;
            case 34:
                return SDK_ASSET_ICON_ROCKET;
            case 35:
                return SDK_ASSET_ICON_RESET;
            case 36:
                return SDK_ASSET_ICON_REMOVE;
            case 37:
                return SDK_ASSET_ICON_REFRESH;
            case 38:
                return SDK_ASSET_ICON_PRODUCTS;
            case 39:
                return SDK_ASSET_ICON_PRODUCT_TRANSACTIONS;
            case 40:
                return SDK_ASSET_ICON_PRODUCT_AUTH;
            case 41:
                return SDK_ASSET_ICON_PLATFORM;
            case 42:
                return SDK_ASSET_ICON_PIE_CHART;
            case 43:
                return SDK_ASSET_ICON_PHONE;
            case 44:
                return SDK_ASSET_ICON_OVERVIEW;
            case 45:
                return SDK_ASSET_ICON_NOTEBOOK;
            case 46:
                return SDK_ASSET_ICON_MOBILE;
            case 47:
                return SDK_ASSET_ICON_MESSAGE;
            case 48:
                return SDK_ASSET_ICON_MENU_S2;
            case 49:
                return SDK_ASSET_ICON_MENU_S1;
            case 50:
                return SDK_ASSET_ICON_MAIL;
            case 51:
                return SDK_ASSET_ICON_LOGOUT;
            case 52:
                return SDK_ASSET_ICON_LOGIN;
            case 53:
                return SDK_ASSET_ICON_LOCK;
            case 54:
                return SDK_ASSET_ICON_LIST;
            case 55:
                return SDK_ASSET_ICON_LINK;
            case 56:
                return SDK_ASSET_ICON_LINE_GRAPH;
            case 57:
                return SDK_ASSET_ICON_LIGHTBULB;
            case 58:
                return SDK_ASSET_ICON_LIBRARIES;
            case 59:
                return SDK_ASSET_ICON_LEARN;
            case 60:
                return SDK_ASSET_ICON_KEY;
            case 61:
                return SDK_ASSET_ICON_ITEMS;
            case 62:
                return SDK_ASSET_ICON_ITEM_MANAGEMENT;
            case 63:
                return SDK_ASSET_ICON_INTEGRATIONS;
            case 64:
                return SDK_ASSET_ICON_INSTITUTION;
            case 65:
                return SDK_ASSET_ICON_INFORMATION;
            case 66:
                return SDK_ASSET_ICON_INBOX;
            case 67:
                return SDK_ASSET_ICON_IDENTITY;
            case 68:
                return SDK_ASSET_ICON_HOME;
            case 69:
                return SDK_ASSET_ICON_HELP;
            case 70:
                return SDK_ASSET_ICON_HAND;
            case 71:
                return SDK_ASSET_ICON_GUIDE;
            case 72:
                return SDK_ASSET_ICON_GLOBE;
            case 73:
                return SDK_ASSET_ICON_GEAR;
            case 74:
                return SDK_ASSET_ICON_FOLDER;
            case 75:
                return SDK_ASSET_ICON_EDIT;
            case 76:
                return SDK_ASSET_ICON_DOWNLOAD;
            case 77:
                return SDK_ASSET_ICON_DOCUMENT;
            case 78:
                return SDK_ASSET_ICON_DOCS;
            case 79:
                return SDK_ASSET_ICON_DATABASE;
            case 80:
                return SDK_ASSET_ICON_COPY;
            case 81:
                return SDK_ASSET_ICON_CONFIGURE;
            case 82:
                return SDK_ASSET_ICON_CLOSE_S2;
            case 83:
                return SDK_ASSET_ICON_CLOSE_S1;
            case 84:
                return SDK_ASSET_ICON_CHEVRON_UP_S1;
            case 85:
                return SDK_ASSET_ICON_CHEVRON_UP_S2;
            case 86:
                return SDK_ASSET_ICON_CHEVRON_RIGHT_S2;
            case 87:
                return SDK_ASSET_ICON_CHEVRON_LEFT_S2;
            case 88:
                return SDK_ASSET_ICON_CHEVRON_RIGHT_S1;
            case 89:
                return SDK_ASSET_ICON_CHEVRON_LEFT_S1;
            case 90:
                return SDK_ASSET_ICON_CHEVRON_DOWN_S1;
            case 91:
                return SDK_ASSET_ICON_CHEVRON_DOWN_S2;
            case 92:
                return SDK_ASSET_ICON_CHANGELOG;
            case 93:
                return SDK_ASSET_ICON_CATEGORIES;
            case 94:
                return SDK_ASSET_ICON_CALENDAR;
            case 95:
                return SDK_ASSET_ICON_BUILDINGS;
            case 96:
                return SDK_ASSET_ICON_BUILD;
            case 97:
                return SDK_ASSET_ICON_BRIEFCASE;
            case 98:
                return SDK_ASSET_ICON_BOOKMARK;
            case 99:
                return SDK_ASSET_ICON_BOOK_OPEN;
            case 100:
                return SDK_ASSET_ICON_BOOK;
            case 101:
                return SDK_ASSET_ICON_BAR_GRAPH;
            case 102:
                return SDK_ASSET_ICON_ATTACHMENT;
            case 103:
                return SDK_ASSET_ICON_ARROW_RIGHT;
            case 104:
                return SDK_ASSET_ICON_ARROW_LEFT;
            case 105:
                return SDK_ASSET_ICON_APPEARANCE_SHOW;
            case 106:
                return SDK_ASSET_ICON_APPEARANCE_HIDE;
            case 107:
                return SDK_ASSET_ICON_ALERT_ERROR;
            case 108:
                return SDK_ASSET_ICON_ALERT_BELL;
            case 109:
                return SDK_ASSET_ICON_ADD_CIRCLE;
            case 110:
                return SDK_ASSET_ICON_ADD;
            case 111:
                return SDK_ASSET_ICON_ACTIVITY;
            case 112:
                return SDK_ASSET_HEADER_ROUTING_NUMBER_HELP;
            case 113:
                return SDK_ASSET_HEADER_ACCOUNT_NUMBER_HELP;
            case 114:
                return SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_TWO_ATTEMPTS;
            case 115:
                return SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_LAST_ATTEMPT;
            case 116:
                return SDK_ASSET_HEADER_MICRODEPOSITS_VERIFICATION_NO_ATTEMPTS;
            case 117:
                return SDK_ASSET_HEADER_OAUTH_LIFTOFF;
            case 118:
                return SDK_ASSET_HEADER_OAUTH_LANDING;
            case 119:
                return SDK_ASSET_HEADER_SMS_TERMS;
            case 120:
                return SDK_ASSET_ICON_LIGHTNING;
            case 121:
                return SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH;
            case 122:
                return SDK_ASSET_ILLUSTRATION_DEPOSIT;
            case 123:
                return SDK_ASSET_ILLUSTRATION_CALENDAR;
            case 124:
                return SDK_ASSET_ILLUSTRATION_SIGNATURE;
            case 125:
                return SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY;
            case 126:
                return SDK_ASSET_PLAID_LOGO_BLACK_BG;
            case 127:
                return SDK_ASSET_ILLUSTRATION_BRIEFCASE;
            case 128:
                return SDK_ASSET_PLAID_LOGO_CIRCLE;
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                return SDK_ASSET_ILLUSTRATION_FORM;
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                return SDK_ASSET_ILLUSTRATION_CONSUMER;
            case SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE:
                return SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND;
            case 132:
                return SDK_ASSET_ILLUSTRATION_IN_CONTROL;
            case 133:
                return SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA;
            case 134:
                return SDK_ASSET_ILLUSTRATION_DEV_LOGS;
            case 135:
                return SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION;
            case 136:
                return SDK_ASSET_ILLUSTRATION_LINK_BANK;
            case 137:
                return SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE;
            case 138:
                return SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA;
            case 139:
                return SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01;
            case 140:
                return SDK_ASSET_ICON_ALERT_ERROR_RED;
            case 141:
                return SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION;
            case 142:
                return SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION;
            case 143:
                return SDK_ASSET_ICON_ALERT_ERROR_BLACK;
            case 144:
                return SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BANK;
            case 145:
                return SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT;
            case 146:
                return SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON;
            case 147:
                return SDK_ASSET_HEADER_UNDER_CONSTRUCTION;
            case 148:
                return SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH;
            case 149:
                return SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG;
            case 150:
                return SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO;
            case 151:
                return SDK_ASSET_HEADER_ABOUT_PLAID_SECURITY;
            case 152:
                return SDK_ASSET_ICON_CHECKMARK_BLUE;
            case 153:
                return SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION;
            case 154:
                return SDK_ASSET_ILLUSTRATION_UPLOAD;
            case 155:
                return SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS;
            case 156:
                return SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED;
            case 157:
                return SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION;
            case 158:
                return SDK_ASSET_ILLUSTRATION_WALLET;
            case 159:
                return SDK_ASSET_ILLUSTRATION_INCOME;
            case 160:
                return SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<d> internalGetValueMap() {
        return f18473b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f18476a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f18475a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static d valueOf(int i11) {
        return forNumber(i11);
    }
}