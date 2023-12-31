package com.goitgroupsevenbot.entity.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Enum for notification time.
 *
 * @author Shalaiev Ivan
 * @version 1.0.0 28.10.2023
 */
@Getter
@RequiredArgsConstructor
public enum NotificationTime {
    NINE(9, "9:00", "NINE"),
    TEN(10, "10:00", "TEN"),
    ELEVEN(11, "11:00", "ELEVEN"),
    TWELVE(12, "12:00", "TWELVE"),
    THIRTEEN(13, "13:00", "THIRTEEN"),
    FOURTEEN(14, "14:00", "FOURTEEN"),
    FIFTEEN(15, "15:00", "FIFTEEN"),
    SIXTEEN(16, "16:00", "SIXTEEN"),
    SEVENTEEN(17, "17:00", "SEVENTEEN"),
    EIGHTEEN(18, "18:00", "EIGHTEEN"),
    TURN_OF_NOTIFICATION(0, "Вимкнути оповіщення", "TURN_OF_NOTIFICATION");
    private final int time;
    private final String text;
    private final String signature;
}
