package org.sprimaudi.zkcontroller.main;

import org.sprimaudi.zkspring.util.PageMgt;
import org.zkoss.lang.Threads;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Window;
import org.zkoss.zul.Menuitem;


/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 7/17/12
 * Time: 1:41 AM
 * To change this template use File | Settings | File Templates.
 */
@VariableResolver(DelegatingVariableResolver.class)
public class MenuController extends SelectorComposer<Window> {

    @Wire
    Menuitem mnApproval;

    @WireVariable
    PageMgt pgm;

    @Wire("window")
    Window self;

    @Override
    public void doAfterCompose(Window comp) throws Exception {
        super.doAfterCompose(comp);    //To change body of overridden methods use File | Settings | File Templates.

    }

    @Listen("onClick=#mnApproval")
    public void approve() {
        pgm.showMain("zuls/perencanaan/browse_perencanaan.zul");
    }

    @Listen("onCreate=window")
    public void onMenu() {
    }

    @Listen("onAfterCreate=window")
    public void onAfterCreate() {


    }
}
