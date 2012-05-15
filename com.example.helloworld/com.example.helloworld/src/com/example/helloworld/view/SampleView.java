package com.example.helloworld.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class SampleView extends ViewPart {

	public static final String ID = "com.example.helloworld.view.SampleView";

	@Override
	public void createPartControl(Composite parent) {
		Label label = new Label(parent, SWT.LEFT);
		label.setText("Hello, Eclipse world!");
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}


}