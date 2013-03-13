package actions.sts899

import net.sourceforge.stripes.action.ActionBean
import net.sourceforge.stripes.action.ActionBeanContext
import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.action.StreamingResolution
import net.sourceforge.stripes.action.UrlBinding

@UrlBinding("/zip/DownloadZip.action/{archiveName}")
class Sts899ActionBean implements ActionBean {

    ActionBeanContext context

    String archiveName

    Resolution display() {
        new StreamingResolution('text/plain',"$archiveName")
    }

}
