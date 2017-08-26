package ru.job4j.tracker;

/**
 *Интерфейс tracker.
 *@author ifedorenko
 *@since 26.08.2017
 *@version 1
 */
public interface Input {
	/**
	 * Метод ask.
	 * @param question Вопрос-подсказка для пользователя.
	 * @return введенную строку
	 */
	String ask(String question);
}