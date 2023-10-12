package ar.edu.unq.tpTemplateYAdapter.wiki;

public class LinkEnComun extends Filter {

	@Override
	protected boolean esSimilar(WikipediaPage p, WikipediaPage page) {
		return p.getLinks().stream().anyMatch(page.getLinks() :: contains);
	}

}
