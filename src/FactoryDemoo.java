import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
	 import org.eclipse.swt.widgets.Shell;



public class FactoryDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
	    Shell shell = new Shell(display);
	    shell.setSize(400, 400);
	    shell.setText("Factory Pattern");
	    shell.setLayout(new RowLayout());
	    ShapeFactoryy shapeFactory = new ShapeFactoryy();
	    final Button buttonRect = new Button(shell, SWT.PUSH);
	    buttonRect.setText("Draw Rectangle");
	    
	    buttonRect.addListener(SWT.Selection,new Listener() {

		
		public void handleEvent(Event event) {
			Display display = new Display();
			Shell shell = new Shell(display);
		    shell.setSize(400, 400);
		    shell.setText("Factory Pattern");
		    shell.setLayout(new RowLayout());
			  switch (event.type) {
		        case SWT.Selection:
		        	ShapeFactoryy shapeFactory = new ShapeFactoryy();
		        	Shapee sh = shapeFactory.createShape("rectangle");
			    	  sh.draw(shell, 10, 60, 100,100);
		          break;
		        }
			
		}
	    });
	    final Button button = new Button(shell, SWT.PUSH);
	    button.setText("Draw Circle");
	    button.addListener(SWT.Selection,new Listener() {

			@Override
			public void handleEvent(Event event) {
				Display display = new Display();
				Shell shell = new Shell(display);
			    shell.setSize(400, 400);
			    shell.setText("Factory Pattern");
			    shell.setLayout(new RowLayout());
				  switch (event.type) {
				  
			        case SWT.Selection:
			        	ShapeFactoryy shapeFactory = new ShapeFactoryy();
			        	Shapee sh = shapeFactory.createShape("circle");
				    	  sh.draw(shell, 120, 60, 100,100);
			          break;
			        }
				
			}
		    });
	    
	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    display.dispose();
	  

	}

}
