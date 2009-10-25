/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/
package org.boris.winrun4j.test;

import org.boris.winrun4j.winapi.DDEML;
import org.boris.winrun4j.winapi.DDEML.DdeCallback;

public class DDENativeTest extends DdeCallback
{
    public static void main(String[] args) throws Exception {
        DdeCallback cb = new DDENativeTest();
        DDEML.initialize(cb, DDEML.APPCLASS_MONITOR | DDEML.MF_CALLBACKS);
    }

    public long ddeCallback(int type, int fmt, long conv, long hsz1, long hsz2, long data, int data1, int data2) {
        return 0;
    }
}
