package bookstoread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookShelf {
	private final List<Book> books = new ArrayList<>();

	public List<Book> books() {
		return Collections.unmodifiableList(books);
	}

	public void add(Book... booksToAdd) {
		Arrays.stream(booksToAdd).forEach(book -> books.add(book));

	}

	public List<Book> arrange() {
		return books.stream().sorted().collect(Collectors.toList());
	}
}
