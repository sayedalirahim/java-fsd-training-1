

import { Shape } from './Shape';

export class Rectangle extends Shape {

    
  

constructor(thenX: number, thenY: number,
    private _width: number,   private _length: number ) {

    super(thenX, thenY);
    

}


    public get width(): number {
        return this._width;
    }
    public set width(value: number) {
        this._width = value;
    }

    
    public get length(): number {
        return this._length;
    }
    public set length(value: number) {
        this._length = value;
    }




}