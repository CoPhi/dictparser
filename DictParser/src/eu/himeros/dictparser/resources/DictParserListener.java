// Generated from C:\prove_java\dictparser\DictParser/src/eu/himeros/dictparser/resources/DictParser.g4 by ANTLR 4.0

    package eu.himeros.dictparser.resources;
    import org.antlr.v4.runtime.*;
    import java.io.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DictParserListener extends ParseTreeListener {
	void enterRoot_set(DictParserParser.Root_setContext ctx);
	void exitRoot_set(DictParserParser.Root_setContext ctx);

	void enterLemma(DictParserParser.LemmaContext ctx);
	void exitLemma(DictParserParser.LemmaContext ctx);

	void enterOther(DictParserParser.OtherContext ctx);
	void exitOther(DictParserParser.OtherContext ctx);

	void enterRoot(DictParserParser.RootContext ctx);
	void exitRoot(DictParserParser.RootContext ctx);

	void enterStar(DictParserParser.StarContext ctx);
	void exitStar(DictParserParser.StarContext ctx);

	void enterLine(DictParserParser.LineContext ctx);
	void exitLine(DictParserParser.LineContext ctx);

	void enterExample_item(DictParserParser.Example_itemContext ctx);
	void exitExample_item(DictParserParser.Example_itemContext ctx);

	void enterSense(DictParserParser.SenseContext ctx);
	void exitSense(DictParserParser.SenseContext ctx);

	void enterLemma_item(DictParserParser.Lemma_itemContext ctx);
	void exitLemma_item(DictParserParser.Lemma_itemContext ctx);

	void enterGlossa_item(DictParserParser.Glossa_itemContext ctx);
	void exitGlossa_item(DictParserParser.Glossa_itemContext ctx);

	void enterSense_item(DictParserParser.Sense_itemContext ctx);
	void exitSense_item(DictParserParser.Sense_itemContext ctx);

	void enterStart(DictParserParser.StartContext ctx);
	void exitStart(DictParserParser.StartContext ctx);

	void enterGlossa(DictParserParser.GlossaContext ctx);
	void exitGlossa(DictParserParser.GlossaContext ctx);

	void enterEol(DictParserParser.EolContext ctx);
	void exitEol(DictParserParser.EolContext ctx);

	void enterEof(DictParserParser.EofContext ctx);
	void exitEof(DictParserParser.EofContext ctx);

	void enterExample(DictParserParser.ExampleContext ctx);
	void exitExample(DictParserParser.ExampleContext ctx);

	void enterComment(DictParserParser.CommentContext ctx);
	void exitComment(DictParserParser.CommentContext ctx);
}