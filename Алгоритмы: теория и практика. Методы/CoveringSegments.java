import java.util.*;

public class CoveringSegments {

	private static ArrayList<Integer> optimalPoints(ArrayList<Segment> segments) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Collections.sort(segments, new Comparator<Segment> () {

			@Override
			public int compare(Segment a, Segment b) {
				if (a.end > b.end)
					return 1;
				else if (a.end < b.end)
					return -1;
				else
					return 0;
			}
			
		});

		while (segments.size() > 0) {
			
			int lastPoint = segments.get(0).end;
			list.add(lastPoint);
			ArrayList<Segment> temp = new ArrayList<Segment>();
			
			for (Segment segment : segments) {
				if (segment.start <= lastPoint && lastPoint <= segment.end) {
					temp.add(segment);
				}
			}
			
			segments.removeAll(temp);
		
		}

		return list;
	}

	private static class Segment {
		int start, end;
		
		Segment(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		public String toString() {
			return start + " " + end;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		ArrayList<Segment> segments = new ArrayList<Segment>();
		for (int i = 0; i < n; i++) {
			int start, end;
			start = scanner.nextInt();
			end = scanner.nextInt();
			segments.add(new Segment(start, end));
		}
		
		scanner.close();
		ArrayList<Integer> points = optimalPoints(segments);
		System.out.println(points.size());
		for (int point : points) {
			System.out.print(point + " ");
		}

	}
}
