import java.util.List;
public class SuperBuilderWithGenerics {
	public static class Parent<A> {
		A field1;
		List<String> items;
		@java.lang.SuppressWarnings("all")
		public static abstract class ParentBuilder<A, C extends SuperBuilderWithGenerics.Parent<A>, B extends SuperBuilderWithGenerics.Parent.ParentBuilder<A, C, B>> {
			@java.lang.SuppressWarnings("all")
			private A field1;
			@java.lang.SuppressWarnings("all")
			private java.util.ArrayList<String> items;
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B field1(final A field1) {
				this.field1 = field1;
				return self();
			}
			@java.lang.SuppressWarnings("all")
			public B item(final String item) {
				if (this.items == null) this.items = new java.util.ArrayList<String>();
				this.items.add(item);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			public B items(final java.util.Collection<? extends String> items) {
				if (items == null) throw new java.lang.NullPointerException("items cannot be null");
				if (this.items == null) this.items = new java.util.ArrayList<String>();
				this.items.addAll(items);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			public B clearItems() {
				if (this.items != null) this.items.clear();
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderWithGenerics.Parent.ParentBuilder(field1=" + this.field1 + ", items=" + this.items + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class ParentBuilderImpl<A> extends SuperBuilderWithGenerics.Parent.ParentBuilder<A, SuperBuilderWithGenerics.Parent<A>, SuperBuilderWithGenerics.Parent.ParentBuilderImpl<A>> {
			@java.lang.SuppressWarnings("all")
			private ParentBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected SuperBuilderWithGenerics.Parent.ParentBuilderImpl<A> self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public SuperBuilderWithGenerics.Parent<A> build() {
				return new SuperBuilderWithGenerics.Parent<A>(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Parent(final SuperBuilderWithGenerics.Parent.ParentBuilder<A, ?, ?> b) {
			this.field1 = b.field1;
			java.util.List<String> items;
			switch (b.items == null ? 0 : b.items.size()) {
			case 0: 
				items = java.util.Collections.emptyList();
				break;
			case 1: 
				items = java.util.Collections.singletonList(b.items.get(0));
				break;
			default: 
				items = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(b.items));
			}
			this.items = items;
		}
		@java.lang.SuppressWarnings("all")
		public static <A> SuperBuilderWithGenerics.Parent.ParentBuilder<A, ?, ?> builder() {
			return new SuperBuilderWithGenerics.Parent.ParentBuilderImpl<A>();
		}
	}
	public static class Child<A> extends Parent<A> {
		double field3;
		@java.lang.SuppressWarnings("all")
		public static abstract class ChildBuilder<A, C extends SuperBuilderWithGenerics.Child<A>, B extends SuperBuilderWithGenerics.Child.ChildBuilder<A, C, B>> extends Parent.ParentBuilder<A, C, B> {
			@java.lang.SuppressWarnings("all")
			private double field3;
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B field3(final double field3) {
				this.field3 = field3;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderWithGenerics.Child.ChildBuilder(super=" + super.toString() + ", field3=" + this.field3 + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class ChildBuilderImpl<A> extends SuperBuilderWithGenerics.Child.ChildBuilder<A, SuperBuilderWithGenerics.Child<A>, SuperBuilderWithGenerics.Child.ChildBuilderImpl<A>> {
			@java.lang.SuppressWarnings("all")
			private ChildBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected SuperBuilderWithGenerics.Child.ChildBuilderImpl<A> self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public SuperBuilderWithGenerics.Child<A> build() {
				return new SuperBuilderWithGenerics.Child<A>(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Child(final SuperBuilderWithGenerics.Child.ChildBuilder<A, ?, ?> b) {
			super(b);
			this.field3 = b.field3;
		}
		@java.lang.SuppressWarnings("all")
		public static <A> SuperBuilderWithGenerics.Child.ChildBuilder<A, ?, ?> builder() {
			return new SuperBuilderWithGenerics.Child.ChildBuilderImpl<A>();
		}
	}
	public static void test() {
		Child<Integer> x = Child.<Integer>builder().field3(0.0).field1(5).item("").build();
	}
}
