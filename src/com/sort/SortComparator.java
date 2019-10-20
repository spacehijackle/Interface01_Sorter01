package com.sort;


/**
 * 任意のクラスを並び替えるためのインターフェース定義
 *
 * @param <T> ソート対象クラス
 *
 * @author t.yoshida
 */
public interface SortComparator<T>
{
	/**
	 * 任意のクラスのプロパティを比較し、１番目の引数のプロパティのほうが
	 * ２番目のそれより大きい場合、true を返す（※昇順の場合）。
	 *
	 * @param compare1 対象クラス
	 * @param compare2 対象クラス
	 * @return true: １番目の引数のプロパティのほうが大きい場合（※昇順の場合）
	 */
	boolean isNeedToExchange(T compare1, T compare2);
}
