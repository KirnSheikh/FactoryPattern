import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Shell;




	public class Circlee implements Shapee {
		public void draw(Shell shell, int x, int y, int width, int height ){
			GC gc = new GC(shell);
			gc.setBackground(shell.getDisplay().getSystemColor(SWT.COLOR_GREEN));
			gc.fillOval(x, y, width, height);
		}
	}

