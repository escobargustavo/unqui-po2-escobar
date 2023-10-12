package ar.edu.unq.tpTemplateYAdapter.wiki;


public class PropiedadEnComun extends Filter{

	@Override
	protected boolean esSimilar(WikipediaPage p, WikipediaPage page) {
		
		return page.getInfobox().keySet().containsAll(p.getInfobox().keySet());
	}

}
