package com.sort;

/**
 * ソートクラス
 *
 * @author t.yoshida
 */
public class Sorter
{
	/**
	 * 任意のクラス配列の並び替え（選択ソート）
	 *
	 * @param targets 対象配列
	 * @param comparator 大小比較
	 */
	public static <E> void selectionSort(E[] targets, SortComparator<E> comparator)
	{
		int count = targets.length;
		for(int i=0; i<count; i++)
		{
			/*
			 * i ～ (count - 1) の間で最小値のインデックスを探索
			 */
			int idxMin = i;
			for(int j=(i+1); j<count; j++)
			{
				if(comparator.isNeedToExchange(targets[idxMin], targets[j]))
				{
					idxMin = j;
				}
			}

			// 最小値のインデックス idxMin の値と i を交換
			E tmp = targets[i];
			targets[i] = targets[idxMin];
			targets[idxMin] = tmp;
		}
	}
}
