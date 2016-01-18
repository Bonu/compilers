/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.parser;

import cpparser.node.*;
import cpparser.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTDoccomment(@SuppressWarnings("unused") TDoccomment node)
    {
        this.index = 0;
    }

    @Override
    public void caseTKsemicolon(@SuppressWarnings("unused") TKsemicolon node)
    {
        this.index = 1;
    }

    @Override
    public void caseTIdentifier(@SuppressWarnings("unused") TIdentifier node)
    {
        this.index = 2;
    }

    @Override
    public void caseTFloatLit(@SuppressWarnings("unused") TFloatLit node)
    {
        this.index = 3;
    }

    @Override
    public void caseTInteger(@SuppressWarnings("unused") TInteger node)
    {
        this.index = 4;
    }

    @Override
    public void caseTCharacter(@SuppressWarnings("unused") TCharacter node)
    {
        this.index = 5;
    }

    @Override
    public void caseTStringLiteral(@SuppressWarnings("unused") TStringLiteral node)
    {
        this.index = 6;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 7;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 8;
    }

    @Override
    public void caseTAssign(@SuppressWarnings("unused") TAssign node)
    {
        this.index = 9;
    }

    @Override
    public void caseTLt(@SuppressWarnings("unused") TLt node)
    {
        this.index = 10;
    }

    @Override
    public void caseTGt(@SuppressWarnings("unused") TGt node)
    {
        this.index = 11;
    }

    @Override
    public void caseTComplement(@SuppressWarnings("unused") TComplement node)
    {
        this.index = 12;
    }

    @Override
    public void caseTBitComplement(@SuppressWarnings("unused") TBitComplement node)
    {
        this.index = 13;
    }

    @Override
    public void caseTQuestion(@SuppressWarnings("unused") TQuestion node)
    {
        this.index = 14;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 15;
    }

    @Override
    public void caseTHash(@SuppressWarnings("unused") THash node)
    {
        this.index = 16;
    }

    @Override
    public void caseTEq(@SuppressWarnings("unused") TEq node)
    {
        this.index = 17;
    }

    @Override
    public void caseTLteq(@SuppressWarnings("unused") TLteq node)
    {
        this.index = 18;
    }

    @Override
    public void caseTGteq(@SuppressWarnings("unused") TGteq node)
    {
        this.index = 19;
    }

    @Override
    public void caseTNeq(@SuppressWarnings("unused") TNeq node)
    {
        this.index = 20;
    }

    @Override
    public void caseTAnd(@SuppressWarnings("unused") TAnd node)
    {
        this.index = 21;
    }

    @Override
    public void caseTOr(@SuppressWarnings("unused") TOr node)
    {
        this.index = 22;
    }

    @Override
    public void caseTPlusPlus(@SuppressWarnings("unused") TPlusPlus node)
    {
        this.index = 23;
    }

    @Override
    public void caseTMinusMinus(@SuppressWarnings("unused") TMinusMinus node)
    {
        this.index = 24;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 25;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 26;
    }

    @Override
    public void caseTStar(@SuppressWarnings("unused") TStar node)
    {
        this.index = 27;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 28;
    }

    @Override
    public void caseTBitAnd(@SuppressWarnings("unused") TBitAnd node)
    {
        this.index = 29;
    }

    @Override
    public void caseTBitOr(@SuppressWarnings("unused") TBitOr node)
    {
        this.index = 30;
    }

    @Override
    public void caseTBitXor(@SuppressWarnings("unused") TBitXor node)
    {
        this.index = 31;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 32;
    }

    @Override
    public void caseTLeftFbrace(@SuppressWarnings("unused") TLeftFbrace node)
    {
        this.index = 33;
    }

    @Override
    public void caseTRightFbrace(@SuppressWarnings("unused") TRightFbrace node)
    {
        this.index = 34;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 35;
    }

    @Override
    public void caseTLeftSbrace(@SuppressWarnings("unused") TLeftSbrace node)
    {
        this.index = 36;
    }

    @Override
    public void caseTRightSbrace(@SuppressWarnings("unused") TRightSbrace node)
    {
        this.index = 37;
    }

    @Override
    public void caseTArrow(@SuppressWarnings("unused") TArrow node)
    {
        this.index = 38;
    }

    @Override
    public void caseTLeftBrace(@SuppressWarnings("unused") TLeftBrace node)
    {
        this.index = 39;
    }

    @Override
    public void caseTRightBrace(@SuppressWarnings("unused") TRightBrace node)
    {
        this.index = 40;
    }

    @Override
    public void caseTDquote(@SuppressWarnings("unused") TDquote node)
    {
        this.index = 41;
    }

    @Override
    public void caseTShiftLeft(@SuppressWarnings("unused") TShiftLeft node)
    {
        this.index = 42;
    }

    @Override
    public void caseTSignedShiftRight(@SuppressWarnings("unused") TSignedShiftRight node)
    {
        this.index = 43;
    }

    @Override
    public void caseTUnsignedShiftRight(@SuppressWarnings("unused") TUnsignedShiftRight node)
    {
        this.index = 44;
    }

    @Override
    public void caseTPlusAssign(@SuppressWarnings("unused") TPlusAssign node)
    {
        this.index = 45;
    }

    @Override
    public void caseTMinusAssign(@SuppressWarnings("unused") TMinusAssign node)
    {
        this.index = 46;
    }

    @Override
    public void caseTStarAssign(@SuppressWarnings("unused") TStarAssign node)
    {
        this.index = 47;
    }

    @Override
    public void caseTDivAssign(@SuppressWarnings("unused") TDivAssign node)
    {
        this.index = 48;
    }

    @Override
    public void caseTBitAndAssign(@SuppressWarnings("unused") TBitAndAssign node)
    {
        this.index = 49;
    }

    @Override
    public void caseTBitOrAssign(@SuppressWarnings("unused") TBitOrAssign node)
    {
        this.index = 50;
    }

    @Override
    public void caseTBitXorAssign(@SuppressWarnings("unused") TBitXorAssign node)
    {
        this.index = 51;
    }

    @Override
    public void caseTModAssign(@SuppressWarnings("unused") TModAssign node)
    {
        this.index = 52;
    }

    @Override
    public void caseTShiftLeftAssign(@SuppressWarnings("unused") TShiftLeftAssign node)
    {
        this.index = 53;
    }

    @Override
    public void caseTSignedShiftRightAssign(@SuppressWarnings("unused") TSignedShiftRightAssign node)
    {
        this.index = 54;
    }

    @Override
    public void caseTUnsignedShiftRightAssign(@SuppressWarnings("unused") TUnsignedShiftRightAssign node)
    {
        this.index = 55;
    }

    @Override
    public void caseTBool(@SuppressWarnings("unused") TBool node)
    {
        this.index = 56;
    }

    @Override
    public void caseTBreak(@SuppressWarnings("unused") TBreak node)
    {
        this.index = 57;
    }

    @Override
    public void caseTChar(@SuppressWarnings("unused") TChar node)
    {
        this.index = 58;
    }

    @Override
    public void caseTKconst(@SuppressWarnings("unused") TKconst node)
    {
        this.index = 59;
    }

    @Override
    public void caseTContinue(@SuppressWarnings("unused") TContinue node)
    {
        this.index = 60;
    }

    @Override
    public void caseTDo(@SuppressWarnings("unused") TDo node)
    {
        this.index = 61;
    }

    @Override
    public void caseTDouble(@SuppressWarnings("unused") TDouble node)
    {
        this.index = 62;
    }

    @Override
    public void caseTElse(@SuppressWarnings("unused") TElse node)
    {
        this.index = 63;
    }

    @Override
    public void caseTEnum(@SuppressWarnings("unused") TEnum node)
    {
        this.index = 64;
    }

    @Override
    public void caseTFalse(@SuppressWarnings("unused") TFalse node)
    {
        this.index = 65;
    }

    @Override
    public void caseTFloat(@SuppressWarnings("unused") TFloat node)
    {
        this.index = 66;
    }

    @Override
    public void caseTIf(@SuppressWarnings("unused") TIf node)
    {
        this.index = 67;
    }

    @Override
    public void caseTInt(@SuppressWarnings("unused") TInt node)
    {
        this.index = 68;
    }

    @Override
    public void caseTKClass(@SuppressWarnings("unused") TKClass node)
    {
        this.index = 69;
    }

    @Override
    public void caseTLong(@SuppressWarnings("unused") TLong node)
    {
        this.index = 70;
    }

    @Override
    public void caseTNew(@SuppressWarnings("unused") TNew node)
    {
        this.index = 71;
    }

    @Override
    public void caseTNull(@SuppressWarnings("unused") TNull node)
    {
        this.index = 72;
    }

    @Override
    public void caseTPrivate(@SuppressWarnings("unused") TPrivate node)
    {
        this.index = 73;
    }

    @Override
    public void caseTProtected(@SuppressWarnings("unused") TProtected node)
    {
        this.index = 74;
    }

    @Override
    public void caseTPublic(@SuppressWarnings("unused") TPublic node)
    {
        this.index = 75;
    }

    @Override
    public void caseTReturn(@SuppressWarnings("unused") TReturn node)
    {
        this.index = 76;
    }

    @Override
    public void caseTShort(@SuppressWarnings("unused") TShort node)
    {
        this.index = 77;
    }

    @Override
    public void caseTSigned(@SuppressWarnings("unused") TSigned node)
    {
        this.index = 78;
    }

    @Override
    public void caseTStatic(@SuppressWarnings("unused") TStatic node)
    {
        this.index = 79;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 80;
    }

    @Override
    public void caseTStruct(@SuppressWarnings("unused") TStruct node)
    {
        this.index = 81;
    }

    @Override
    public void caseTThis(@SuppressWarnings("unused") TThis node)
    {
        this.index = 82;
    }

    @Override
    public void caseTTrue(@SuppressWarnings("unused") TTrue node)
    {
        this.index = 83;
    }

    @Override
    public void caseTWhile(@SuppressWarnings("unused") TWhile node)
    {
        this.index = 84;
    }

    @Override
    public void caseTUnsigned(@SuppressWarnings("unused") TUnsigned node)
    {
        this.index = 85;
    }

    @Override
    public void caseTVoid(@SuppressWarnings("unused") TVoid node)
    {
        this.index = 86;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 87;
    }
}
