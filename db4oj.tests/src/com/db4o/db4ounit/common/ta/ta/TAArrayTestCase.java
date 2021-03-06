/* Copyright (C) 2007  Versant Inc.  http://www.db4o.com */

package com.db4o.db4ounit.common.ta.ta;

import com.db4o.db4ounit.common.ta.*;

import db4ounit.*;

/**
 * @exclude
 */
public class TAArrayTestCase extends TAItemTestCaseBase {
	
	private static final int[] INTS1 = new int[] {1,2,3};
	
	private static final int[] INTS2 = new int[] {4,5,6};
	
	private static final LinkedList[] LIST1 = new LinkedList[] { LinkedList.newList(5), LinkedList.newList(5) };

	private static final LinkedList[] LIST2 = new LinkedList[] { LinkedList.newList(5), LinkedList.newList(5) };

	public static void main(String[] args) {
		new TAArrayTestCase().runAll();
	}

	protected Object createItem() throws Exception {
		TAArrayItem item = new TAArrayItem();
		item.value = INTS1;
		item.obj = INTS2;
		
		item.lists = LIST1;
		item.listsObject = LIST2;
		return item;
	}

	protected void assertItemValue(Object obj) throws Exception {
		TAArrayItem item = (TAArrayItem) obj;
		ArrayAssert.areEqual(INTS1, item.value());
		ArrayAssert.areEqual(INTS2, (int[])item.object());
		ArrayAssert.areEqual(LIST1, item.lists());
		ArrayAssert.areEqual(LIST2, (LinkedList[]) item.listsObject());
	}
}
