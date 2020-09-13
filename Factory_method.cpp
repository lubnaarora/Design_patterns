#include<iostream>
#include<vector>

using namespace std;

enum{
	Prod_a,
	Prod_b,
	Prod_c,
	Prod_d
};

class Product
{
	public:
		static Product *create(int choice);
		virtual void display() = 0;
};



class ProductA : public Product
{
	public:
		void display()
		{
			cout<<" Show ProductA "<<endl;
		}
};

class ProductB : public Product
{
	public:
		void display()
		{
			cout<<" Show ProductB "<<endl;
		}
};


class ProductC : public Product
{
	public:
		void display()
		{
			cout<<" Show ProductC "<<endl;
		}
};


Product *Product::create(int type)
{
	if( type == Prod_a)
	{
		return new ProductA;
	}
	else if( type == Prod_b)
	{
		return new ProductB;
	}
	else if( type == Prod_c)
	{
		return new ProductC;
	}
	else
	{
		cout<<" Implementation not yet defined"<<endl;
	}
}

int main()
{
	vector<Product*> products;

	products.push_back(Product::create(Prod_a));
	products.push_back(Product::create(Prod_b));
	products.push_back(Product::create(Prod_c));
	products.push_back(Product::create(Prod_d));

	for(int i=0;i<products.size();i++)
		products[i]->display();

	for(int i=0;i<products.size()-1;i++)
		delete products[i];
}
