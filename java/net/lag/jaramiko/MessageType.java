/*
 * Copyright (C) 2005-2007 Robey Pointer <robey@lag.net>
 *
 * This file is part of jaramiko.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package net.lag.jaramiko;

/**
 * Constants used by jaramiko for SSH2 packet types.
 */
/* package */class MessageType {
    public static final byte DISCONNECT = 1;
    public static final byte IGNORE = 2;
    public static final byte UNIMPLEMENTED = 3;
    public static final byte DEBUG = 4;
    public static final byte SERVICE_REQUEST = 5;
    public static final byte SERVICE_ACCEPT = 6;

    public static final byte KEX_INIT = 20;
    public static final byte NEW_KEYS = 21;

    public static final byte KEX_0 = 30;
    public static final byte KEX_1 = 31;
    public static final byte KEX_2 = 32;
    public static final byte KEX_3 = 33;
    public static final byte KEX_4 = 34;

    public static final byte USERAUTH_REQUEST = 50;
    public static final byte USERAUTH_FAILURE = 51;
    public static final byte USERAUTH_SUCCESS = 52;
    public static final byte USERAUTH_BANNER = 53;

    public static final byte USERAUTH_PK_OK = 60;

    public static final byte USERAUTH_INFO_REQUEST = 60;
    public static final byte USERAUTH_INFO_RESPONSE = 61;

    public static final byte GLOBAL_REQUEST = 80;
    public static final byte REQUEST_SUCCESS = 81;
    public static final byte REQUEST_FAILURE = 82;

    public static final byte CHANNEL_OPEN = 90;
    public static final byte CHANNEL_OPEN_SUCCESS = 91;
    public static final byte CHANNEL_OPEN_FAILURE = 92;
    public static final byte CHANNEL_WINDOW_ADJUST = 93;
    public static final byte CHANNEL_DATA = 94;
    public static final byte CHANNEL_EXTENDED_DATA = 95;
    public static final byte CHANNEL_EOF = 96;
    public static final byte CHANNEL_CLOSE = 97;
    public static final byte CHANNEL_REQUEST = 98;
    public static final byte CHANNEL_SUCCESS = 99;
    public static final byte CHANNEL_FAILURE = 100;

    public static String getDescription(byte t) {
        switch (t) {
        case DISCONNECT:
            return "disconnect";
        case IGNORE:
            return "ignore";
        case UNIMPLEMENTED:
            return "unimplemented";
        case DEBUG:
            return "debug";
        case SERVICE_REQUEST:
            return "service-request";
        case SERVICE_ACCEPT:
            return "service-accept";
        case KEX_INIT:
            return "kex-init";
        case NEW_KEYS:
            return "new-keys";
        case KEX_0:
            return "kex0";
        case KEX_1:
            return "kex1";
        case KEX_2:
            return "kex2";
        case KEX_3:
            return "kex3";
        case KEX_4:
            return "kex4";
        case USERAUTH_REQUEST:
            return "userauth-request";
        case USERAUTH_FAILURE:
            return "userauth-failure";
        case USERAUTH_SUCCESS:
            return "userauth-success";
        case USERAUTH_BANNER:
            return "userauth-banner";
        case USERAUTH_PK_OK:
            return "userauth-pk-ok/info-request";
        case USERAUTH_INFO_RESPONSE:
            return "userauth-info-response";
        case GLOBAL_REQUEST:
            return "global-request";
        case REQUEST_SUCCESS:
            return "request-success";
        case REQUEST_FAILURE:
            return "request-failure";
        case CHANNEL_OPEN:
            return "channel-open";
        case CHANNEL_OPEN_SUCCESS:
            return "channel-open-success";
        case CHANNEL_OPEN_FAILURE:
            return "channel-open-failure";
        case CHANNEL_WINDOW_ADJUST:
            return "channel-window-adjust";
        case CHANNEL_DATA:
            return "channel-data";
        case CHANNEL_EXTENDED_DATA:
            return "channel-extended-data";
        case CHANNEL_EOF:
            return "channel-eof";
        case CHANNEL_CLOSE:
            return "channel-close";
        case CHANNEL_REQUEST:
            return "channel-request";
        case CHANNEL_SUCCESS:
            return "channel-success";
        case CHANNEL_FAILURE:
            return "channel-failure";
        default:
            return "$" + Integer.toString(t);
        }
    }

}