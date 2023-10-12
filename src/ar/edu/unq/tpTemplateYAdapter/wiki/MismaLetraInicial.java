package ar.edu.unq.tpTemplateYAdapter.wiki;

public class MismaLetraInicial extends Filter{

	@Override
	protected boolean esSimilar(WikipediaPage p, WikipediaPage page) {
		return p.getTitle().startsWith(page.getTitle().substring(0,1));
	}

}
