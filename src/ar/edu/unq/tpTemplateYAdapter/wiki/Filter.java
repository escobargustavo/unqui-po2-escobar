package ar.edu.unq.tpTemplateYAdapter.wiki;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Filter {

	public final List<WikipediaPage> getSimilarPages(WikipediaPage page,
			List<WikipediaPage> wikipedia){
		List<WikipediaPage> resultado = new ArrayList<WikipediaPage>();
		resultado = wikipedia.stream().
				filter(p -> esSimilar(p,page)).
				collect(Collectors.toList());
		
				return resultado;
		
	}

	protected abstract boolean esSimilar(WikipediaPage p, WikipediaPage page);
	
}
